package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");

        Employee e1=(Employee) context.getBean("employee1");
        Employee e2= context.getBean("employee2",Employee.class);

    }
}