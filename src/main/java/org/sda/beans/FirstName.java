package org.sda.beans;

import org.sda.interfaces.BeanName;
import org.springframework.stereotype.Component;

// Registering this class as a component
@Component(value = "firstName")
public class FirstName implements BeanName {
    private String name;

    // constructor
    public FirstName() {
        this.name = "Kristel";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
