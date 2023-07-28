package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

   @Bean
    public Principal principalBean(){
       return new Principal();
   }
    @Bean(name = "collBean")
    public Collage collegeBean(){
        return new Collage(principalBean());
    }
}
