package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

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
}
