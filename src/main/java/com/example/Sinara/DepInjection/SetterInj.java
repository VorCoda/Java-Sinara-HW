package com.example.Sinara.DepInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterInj {

    private DInjExmp dInjExmp;

    @Autowired
    public void setdInjExmp(@Qualifier("A") DInjExmp dInjExmp){
        this.dInjExmp = dInjExmp;
    }

    public void print(){
        dInjExmp.exmpPrint();
    }
}
