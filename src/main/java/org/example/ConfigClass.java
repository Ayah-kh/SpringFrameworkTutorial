package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

   @Bean
    public Principal principalBean(){
       return new Principal();
   }
    @Bean
    public Collage collegeBean(){
        Collage collage = new Collage();
        collage.setPrincipal(principalBean());
        return collage;
    }
}
