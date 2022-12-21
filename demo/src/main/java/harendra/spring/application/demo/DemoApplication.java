package harendra.spring.application.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	@GetMapping("/message")
	public String message(){
		return "Spring Boot Application Deployment with Aure ";
	}
	public static void main(String[] args) {
		System.out.println("hello Application");


		SpringApplication.run(DemoApplication.class, args);
	}

}
