package com.mm.springcloud.authjwt.user.client.hystrix;


import com.mm.springcloud.authjwt.user.client.AuthServiceClient;
import com.mm.springcloud.authjwt.user.entity.JWT;
import org.springframework.stereotype.Component;

/**
 * Created by fangzhipeng on 2017/5/31.
 */
@Component
public class AuthServiceHystrix implements AuthServiceClient {
    @Override
    public JWT getToken(String authorization, String type, String username, String password) {
        return null;
    }
}
