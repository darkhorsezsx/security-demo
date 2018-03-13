package com.zsx.demo.springsecurity.sso.manual;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 * This is {@link ManualSSOApplicationConfig}.
 *
 * @author Zhang Shixu
 * @since 0.0.1
 */
@EnableAutoConfiguration
@ComponentScan({
        "com.zsx.demo.springsecurity.sso.manual",
})
public class ManualSSOApplicationConfig {

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(ManualSSOApplicationConfig.class)
                .run(args);
    }

}
