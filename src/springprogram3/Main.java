package springprogram3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springprogram3.beans.Student;
import springprogram4.resources.SpringConfigFile;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student std = (Student) context.getBean("student");
        std.display();
     }
}
