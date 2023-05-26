package com.mursalin.contentcalendar;

import com.mursalin.contentcalendar.model.Content;
import com.mursalin.contentcalendar.model.Status;
import com.mursalin.contentcalendar.model.Type;
import com.mursalin.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class ContentCalendarApplication {

	public static void main(String[] args) {

		SpringApplication.run(ContentCalendarApplication.class, args);

	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			System.out.println("Bootstrapping Database Repository using CommandLineRunner@Bean");

			Content content = new Content(null,
					"Bootstrapping by CommandLineRunner",
					"Inserting content into Repository using CommandLineRunner Bootstrapping",
					Status.IN_PROGRESS,
					Type.ARTICLE,
					LocalDateTime.now(),
					null,
					"");
			repository.save(content);
		};
	}

}
/*
```
- Run the application using the following command:
```
$ mvn spring-boot:run
```
- Open a browser and navigate to http://localhost:8080
- You should see the following output:
```
Hello World!
```
- You can also run the application from the IDE.
- Open the ContentCalendarApplication.java file in the IDE and click the Run icon.
- You should see the following output:
```
Hello World!
```
- You can also run the application from the command line.
- Open a terminal window and navigate to the project root folder.
- Run the following command:
```
$ mvn spring-boot:run
```
- You should see the following output:
```
Hello World!
```

## 2.2. Understanding the Spring Boot Application

- The main() method is the entry point of the application.
- The @SpringBootApplication annotation is used to mark a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning.
- The @ComponentScan annotation tells Spring to look for other components, configurations, and services in the com.mursalin.contentcalendar package, allowing it to find the controllers.
- The @Configuration annotation indicates that the class can be used by the Spring IoC container as a source of bean definitions.
- The @EnableAutoConfiguration annotation tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
- The @Bean annotation tells Spring that a method produces a bean that should be managed by the Spring container.
- The @Component annotation marks a Java class as a bean so the component-scanning mechanism of Spring can add it into the application context.
- The @Controller annotation marks the class as a web controller.
- The @RequestMapping annotation maps HTTP requests to handler methods of the controller.
- The @ResponseBody annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object.
- The @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan with their default attributes.
- The @ComponentScan annotation tells Spring to scan the com.mursalin.contentcalendar package for other components, configurations, and services to be loaded into the IoC container.
- The @Configuration annotation indicates that the class can be used by the Spring IoC container as a source of bean definitions.
- The @EnableAutoConfiguration annotation tells Spring Boot to*/
