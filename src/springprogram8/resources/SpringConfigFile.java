package springprogram8.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springprogram8.beans.Address;
import springprogram8.beans.Student;

@Configuration
public class SpringConfigFile {
    @Bean
    public Address createAddrObj(){
        Address addr = new Address();

        addr.setHouseNo(100);
        addr.setCity("Varanasi");
        addr.setPincode(221005);

        return addr;
    }

    @Bean
    public Student createStudentObj(){
        Student stu = new Student();

        stu.setName("Abhinav");
        stu.setRollNo(21);
        stu.setAddress(createAddrObj());

        return stu;
    }
}
