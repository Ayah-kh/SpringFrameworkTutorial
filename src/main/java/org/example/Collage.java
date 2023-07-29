package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Collage {

    @Value("${college.Name}")
//    @Value("The Great Collage")
    private String collegeName;
    @Autowired
    private Principal principal;
    @Autowired
    private Teacher teacher;


//        @Autowired
//    public void setPrincipal(Principal principal) {
//        this.principal = principal;
//    }
//
//    @Autowired
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }

    public void test() {
        principal.principleInfo();
        teacher.teach();
        System.out.println("testing this method");
        System.out.println("My Collage name is: "+collegeName);
    }
}
