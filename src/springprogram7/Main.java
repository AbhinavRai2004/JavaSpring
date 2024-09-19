package springprogram7;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springprogram7.beans.Student;
import springprogram7.resources.SpringConfigFile;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student stud = context.getBean(Student.class);
        stud.display();
    }
}
