package springprogram5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springprogram5.beans.Student;

public class Main {
    public static void main(String[] args) {
        String config_loc = "springprogram5/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);

        Student stud = (Student) context.getBean("stid1");
        stud.display();
    }
}
