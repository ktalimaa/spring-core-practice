package org.sda.beans;

import org.sda.interfaces.BeanName;
import org.springframework.stereotype.Component;

@Component(value = "secondName")
public class SecondName implements BeanName {

    private String name;

    public SecondName() {
        this.name = "Talimaa";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
