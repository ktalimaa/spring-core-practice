package org.sda.beans;

import lombok.Setter;
import org.sda.interfaces.BeanName;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Setter
@Component
// If you register any class with component, then these classes will be executed automatically
public class MyBean {
    private BeanName name;

    // BeanName is interface which implements first and second name classes
    public MyBean(@Qualifier("firstName") BeanName name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hello! " + name.getName();
    }


}
