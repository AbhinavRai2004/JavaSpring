package springprogram8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springprogram8.beans.Student;
import springprogram8.resources.SpringConfigFile;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student stud = context.getBean(Student.class);
        stud.display();
    }
}
