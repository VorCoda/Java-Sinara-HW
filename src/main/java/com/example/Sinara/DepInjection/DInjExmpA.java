package com.example.Sinara.DepInjection;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("A")
public class DInjExmpA implements DInjExmp {

    @Override
    public void exmpPrint(){
        System.out.println("It is just a test from A");
    }

    @PostConstruct
    public void init(){
        System.out.println(" Bean which called DInjExmpA was created successfully");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean which called DInjExmpA  was deleted successfully");
    }
}
