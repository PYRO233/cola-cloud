package com.honvay.cola.cloud.uc;

import com.honvay.cola.cloud.framework.security.access.EnableSecurityAccess;
import org.springframework.boot.SpringApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author LIQIU 
 * @date 2018-3-8
 **/
@SpringCloudApplication
@EnableOAuth2Client
@EnableResourceServer
@EnableFeignClients
@ComponentScan("com.honvay")
@EnableSecurityAccess
@EnableCaching
public class UcApplication{

    public static void main(String[] args) {
        SpringApplication.run(UcApplication.class, args);
    }

}
