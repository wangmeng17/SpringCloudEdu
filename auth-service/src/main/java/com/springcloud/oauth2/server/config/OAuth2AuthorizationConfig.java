package com.springcloud.oauth2.server.config;

import com.springcloud.oauth2.server.service.security.UserServiceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;


/**
 * @Auther: wang.meng
 * @Date: 2018/12/19  11:33
 * @Description:
 */
@Configuration
@EnableAuthorizationServer //开启授权服务的功能
public class OAuth2AuthorizationConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    //如果资源服务和授权服务是同一个服务，用InMemoryTokenStore
    //是最好的选择。如果资源服务和授权服务不是同一个服务，则不用InMemoryTokenStore 进行
    //存储Token 。因为当授权服务出现故障，需要重启服务，之前存在内存中Token 全部丢失，导
    //致资源服务的Token 全部失效。
    //private TokenStore tokenStore = new InMemoryTokenStore();//token存储在内存中

    @Autowired
    @Qualifier("authenticationManagerBean")
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserServiceDetail userServiceDetail;

    //ClientDetailsServiceConfigurer 配置了客户端的一些基本信息，
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        //clients.inMemory()方法配置了将客户端的信息存储在内存中，
        //.withClient （” browser ”）方法创建了一个clientld 为browser 的客户端，
        // a uthorizedGrantTypes （” refresh _token ” ， ”password”）方法配置了验证类型为refresh token 和password,
        // .scopes （”ui ”）方法配置了客户端域为“ ui ”。接着创建了另一个client,它的Id 为“ se rvice-hi ”。
        clients.inMemory()
                .withClient("browser")
                .authorizedGrantTypes("refresh_token", "password")
                .scopes("ui")
                .and()
                .withClient("service-hi")
                .secret("123456")
                .authorizedGrantTypes("client_credentials", "refresh_token","password")
                .scopes("server");
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints
                .tokenStore(new JdbcTokenStore(dataSource))
                .authenticationManager(authenticationManager)
                .userDetailsService(userServiceDetail);
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
        oauthServer
                .tokenKeyAccess("permitAll()")
                .checkTokenAccess("isAuthenticated()");
    }
}
