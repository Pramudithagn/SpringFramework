package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

//        Doctor doctor = new Doctor();
        Staff staff = context.getBean(Nurse.class);
        staff.assist();

    }
}
