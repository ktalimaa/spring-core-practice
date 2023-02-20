package org.sda.configuration;

import org.sda.beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// whenever making configuration class for anything @Configuration must be added
@Configuration
public class ApplicationConfiguration {

    // creating a bean; @Bean makes Spring automatically run it as a bean
    @Bean
    public MyBean myBean() {
        MyBean myBean = new MyBean();
        myBean.setName("Kristel");
        return myBean;
    }


}
