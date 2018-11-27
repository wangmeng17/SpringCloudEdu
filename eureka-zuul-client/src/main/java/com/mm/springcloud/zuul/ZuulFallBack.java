package com.mm.springcloud.zuul;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/27  17:40
 * @Description:
 */
@Configuration
public class ZuulFallBack implements FallbackProvider {
    @Override
    public String getRoute() {
        return "eureka-client1";  //服务id，可以用* 或者 null 代表所有服务都过滤
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.OK; //请求网关成功了，所以是ok
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return HttpStatus.OK.value();
            }

            @Override
            public String getStatusText() throws IOException {
                return HttpStatus.OK.getReasonPhrase();
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                JSONObject json = new JSONObject();
                json.put("state", "501");
                json.put("msg", "后台接口错误");
                return new ByteArrayInputStream(json.toJSONString().getBytes("UTF-8")); //返回前端的内容
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders httpHeaders = new HttpHeaders();
                httpHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8); //设置头
                return httpHeaders;
            }
        };
    }
}
