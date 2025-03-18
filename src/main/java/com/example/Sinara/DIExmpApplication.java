package com.example.Sinara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DIExmpApplication implements CommandLineRunner {

    @Autowired
    ConstructorInj constructorInj;

    @Autowired
    SetterInj setterInj;

    @Autowired
    FieldInj fieldInj;

    public static void main(String[] args) {
        SpringApplication.run(DIExmpApplication.class, args);
    }

    @Override
    public  void run (String... args) throws Exception{
        System.out.println("ConstructorInj answer:");
        constructorInj.print();

        System.out.println("SetterInj answer:");
        setterInj.print();

        System.out.println("FieldInj answer:");
        fieldInj.print();
    }
}

