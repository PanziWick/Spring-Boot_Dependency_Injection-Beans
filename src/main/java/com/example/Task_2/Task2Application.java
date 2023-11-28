package com.example.Task_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Task2Application {
	public static void main(String[] args) {
		//SpringApplication.run(Task2Application.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(Task2Application.class, args);
		MyService myService = context.getBean(MyService.class);
		System.out.println(myService.getWelcomeMessage());
		System.out.println("Application Title "+ myService.getAppTitle());


		Student student = (Student) context.getBean("studentBean");
		System.out.println("Student Name:" + student.getName());
	}

}
