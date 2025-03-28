package com.example.Sinara;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;




import java.util.Arrays;
import java.util.Set;

@SpringBootApplication
public class JavaSinaraApplication  implements CommandLineRunner {

    private final Environment environment;
    @Value("${app.name}")
    private String appName;
    @Value("${EXAMPLE_TEST:default}")
    private String exampleTest;

    public JavaSinaraApplication(Environment environment)  {
        this.environment = environment;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Active Profiles: " + Arrays.toString(environment.getActiveProfiles()));
        System.out.println("App Name: " + appName);
        System.out.println("EXAMPLE_TEST: " + exampleTest);
    }


	public static void main(String[] args) {
		SpringApplication.run(JavaSinaraApplication.class, args);

	}

}


