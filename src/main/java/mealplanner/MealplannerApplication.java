package mealplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class MealplannerApplication {
	
	static {
		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
		dotenv.entries().forEach(entry -> 
			System.setProperty(entry.getKey(),entry.getValue())
		);
	}

	public static void main(String[] args) {
		SpringApplication.run(MealplannerApplication.class, args);
	}

}
