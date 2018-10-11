package com.codenotfound.primefaces;

import javax.faces.bean.ManagedBean;
import org.apache.cxf.bus.spring.SpringBus;

@ManagedBean
public class HelloWorld {
    
    private String firstName = "John";
    private String lastName = "Doe";
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String showGreeting() {
        SpringBus bus = new SpringBus();
        return "Hello " + firstName + " " + lastName + "!";
    }
}
