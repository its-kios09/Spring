package com.itskios09.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){};
record Address(String firstLine, String city){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Learning Spring..................";
    }
    @Bean
    public int age(){
        return 15;
    }
    @Bean
    public Person person(){
        return new Person("Fredrick", 20);
    }
    @Bean
    public Address address(){
        return new Address("P.O Box 3364 - 00100", "Nairobi");
    }

}
