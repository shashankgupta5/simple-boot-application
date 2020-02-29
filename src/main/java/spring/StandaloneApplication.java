package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import spring.app.StandaloneContextInitializer;

@Import(StandaloneContextInitializer.class)
@SpringBootApplication
public class StandaloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandaloneApplication.class, args);
	}
}
