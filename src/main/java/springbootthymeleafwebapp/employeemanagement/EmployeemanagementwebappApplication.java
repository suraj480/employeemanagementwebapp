package springbootthymeleafwebapp.employeemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("springbootthymeleafwebapp")
@ComponentScan(basePackages = {"springbootthymeleafwebapp.controller","springbootthymeleafwebapp.model","springbootthymeleafwebapp.repository","springbootthymeleafwebapp.service"})
@EnableJpaRepositories(basePackages = {"springbootthymeleafwebapp.controller","springbootthymeleafwebapp.model","springbootthymeleafwebapp.repository","springbootthymeleafwebapp.service"})
public class EmployeemanagementwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagementwebappApplication.class, args);
	}

}
