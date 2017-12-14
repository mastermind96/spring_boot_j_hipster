package za.co.synthesis.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Component scan for Configuration classes
@ComponentScan
// Attempts to configure the beans likely needed (autowired etc)
@EnableAutoConfiguration
// Enable the boot application (embed in tomcat
@SpringBootApplication
public class DemospringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemospringApplication.class, args);
	}
}
