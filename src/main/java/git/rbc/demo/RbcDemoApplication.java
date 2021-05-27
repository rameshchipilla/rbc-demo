package git.rbc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RbcDemoApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(RbcDemoApplication.class);
		app.run();
	}
}
