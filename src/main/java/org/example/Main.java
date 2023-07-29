package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(ConfigClass.class);

        Collage collegeBean = context.getBean("collage", Collage.class);
        System.out.println("college object created: "+collegeBean);
        collegeBean.test();
        context.close();


//        Employee e1=(Employee) context.getBean("employee1");
////        Employee e2= context.getBean("employee2",Employee.class);
//
//        System.out.println("Employee 1 "+e1);
////        System.out.println("Employee 2 "+e2);

    }
}