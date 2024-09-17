package springprogram4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springprogram3.beans.Student;

public class Main {
    public static void main(String[] args) {

        String res_file_path = "/springprogram3/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(res_file_path);

        Student std = (Student) context.getBean("student");
        std.display();
     }
}
