package harendra.spring.application.demo.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMyController {

    @GetMapping

    public String  hello(){
        return  "Hello Spring Boot Application";

    }
}
