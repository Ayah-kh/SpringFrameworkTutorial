package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages ="org.example" )
@PropertySource("classpath:my-properties.properties")
public class ConfigClass {
/*
   @Bean
    public Teacher mathTeacherBean(){
        return new MathTeacher();
    }

   @Bean
    public Principal principalBean(){
       return new Principal();
   }
    @Bean
    public Collage collegeBean(){
        Collage collage = new Collage();
        collage.setPrincipal(principalBean());
        collage.setTeacher(mathTeacherBean());
        return collage;
    }

    */
}
