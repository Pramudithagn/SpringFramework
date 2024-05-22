package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

//        Doctor doctor = new Doctor();
        Doctor staff = context.getBean(Doctor.class);
        staff.assist();
//        staff.getQualification();
//
        System.out.println( staff.getQualification());

        context.close();
    }
}
