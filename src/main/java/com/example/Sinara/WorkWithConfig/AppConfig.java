package com.example.Sinara.WorkWithConfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

    @Bean
    @Profile("test")
    public FirstBean first(){
        return new FirstBean();
    }

    @Bean
    @ConditionalOnBean(FirstBean.class)
    public SecondBean second(){
        return new SecondBean();
    }

    @Bean
    @ConditionalOnExpression("'${EXAMPLE_TEST}' != 'default'")
    public ThirdBean thirdBean() {
        return new ThirdBean();
    }
}
