package org.sda.beans;

import lombok.Setter;
import org.springframework.stereotype.Service;

/**
 * @author Kristel Talimaa
 */

@Setter
@Service("myBean")
// Service is a component which works with bean
public class MyBean {
    private String name;

    public String sayHello() {
        return "Hello! " + name;
    }


}
