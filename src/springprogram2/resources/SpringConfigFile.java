package springprogram2.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springprogram1.beans.Student;

@Configuration
public class SpringConfigFile {
    @Bean
    public Student stdId1(){
        Student std = new Student();

        //set values in student object
        std.setName("kamal");
        std.setRollNo(103);
        std.setEmail("kamal@k.com");

        return std;
    }

    @Bean("stdObj2")
    public Student createStdBeanObj2(){
        Student std = new Student();

        //set values in student object
        std.setName("Abhinav");
        std.setRollNo(12);
        std.setEmail("abhi@abhi.com");

        return std;
    }
}
