package org.example;

import org.springframework.stereotype.Component;


public class Collage {

    private Principal principal;
    private Teacher teacher;

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void test(){
        principal.principleInfo();
        System.out.println("testing this method");
    }
}
