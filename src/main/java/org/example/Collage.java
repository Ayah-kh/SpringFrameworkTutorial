package org.example;

import org.springframework.stereotype.Component;


public class Collage {

    private Principal principal;

    public Collage(Principal principal) {
        this.principal = principal;
    }

    public void test(){
        principal.principleInfo();
        System.out.println("testing this method");
    }
}
