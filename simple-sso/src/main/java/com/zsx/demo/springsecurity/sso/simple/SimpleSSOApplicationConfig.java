package com.zsx.demo.springsecurity.sso.simple;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 * This is {@link SimpleSSOApplicationConfig}.
 *
 * @author Zhang Shixu
 * @since 0.0.1
 */
@EnableAutoConfiguration
@ComponentScan({
        "com.zsx.demo.springsecurity.sso.simple",
})
@EnableOAuth2Sso
public class SimpleSSOApplicationConfig {

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(SimpleSSOApplicationConfig.class)
                .run(args);
    }

}
