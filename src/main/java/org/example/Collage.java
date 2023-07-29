package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Collage {


    private Principal principal;
    private Teacher teacher;

    @Autowired
    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    @Autowired
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void test() {
        principal.principleInfo();
        teacher.teach();
        System.out.println("testing this method");
    }
}
