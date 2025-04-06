package com.example.Sinara.DepInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FieldInj {

    @Autowired
    @Qualifier("A")
    private DInjExmp dInjExmp;

    public void print(){
        dInjExmp.exmpPrint();
    }
}
