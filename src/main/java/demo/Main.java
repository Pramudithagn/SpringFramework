package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

//        Doctor doctor = new Doctor();
        Doctor staff = context.getBean(Doctor.class);
        staff.assist();
//        staff.getQualification();
//
//        System.out.println( staff.getQualification());

    }
}
