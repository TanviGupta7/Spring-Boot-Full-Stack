package com.InvincibleTanvi.Introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    PaymentService paymentService(){
        //can add more logic before a bean is created.
        return new PaymentService();
    }
    @PostConstruct
    public void afterInitialization(){
        System.out.println("Before paying.");
    }
    @PreDestroy
    public void beforeDestroy(){
        System.out.println("After paying is done");
    }
}
