package springprogram4.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan("springprogram3.beans")
@ComponentScan({"springprogram3.beans"})

public class SpringConfigFile {

}
