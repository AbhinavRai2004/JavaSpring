package springprogram2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springprogram1.beans.Student;
import springprogram2.resources.SpringConfigFile;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

//        this is only used when there is only one method available.
//        Student std = context.getBean(Student.class);

        Student std = (Student) context.getBean("stdId1");
        std.display();

        System.out.println("-------------------------------------");

        Student std1 = (Student) context.getBean("stdObj2");
        std1.display();
    }
}

