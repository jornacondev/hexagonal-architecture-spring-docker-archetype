#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.infrastructure.config.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"${package}.infrastructure"})
public class SpringBootService {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootService.class, args);
    }

}