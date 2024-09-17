package springprogram1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springprogram1.beans.Student;

public class Main {
    public static void main(String[] args) {
        String config_loc = "springprogram1/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);

        Student std = (Student) context.getBean("stid1");
        std.display();
    }
}
