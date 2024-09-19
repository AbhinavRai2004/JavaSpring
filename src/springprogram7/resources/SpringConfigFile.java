package springprogram7.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springprogram7.beans.Address;
import springprogram7.beans.Student;

import java.awt.dnd.DragGestureEvent;

@Configuration
public class SpringConfigFile {
    @Bean
    public Address createAddrObj(){
       Address addr = new Address(123,"Varanasi",221010);
       return addr;
    }

    @Bean
    public Student createStudObj(){
        Student stu = new Student(12,"Abhinav",createAddrObj());
        return stu;
    }
}
