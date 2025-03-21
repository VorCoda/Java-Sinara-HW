package com.example.Sinara;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("B")
public class DInjExmpB implements DInjExmp {

    @Override
    public void exmpPrint(){
        System.out.println("It is just a test from B");
    }

    @PostConstruct
    public void init(){
        System.out.println(" Bean which called DInjExmpB was created successfully");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean which called DInjExmpB  was deleted successfully");
    }
}
