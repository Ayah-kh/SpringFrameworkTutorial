package org.example;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("Hi, I am Tony, your Science teacher");
    }
}
