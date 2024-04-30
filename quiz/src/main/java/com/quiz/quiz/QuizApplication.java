package com.quiz.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//(scanBasePackages={"com.quiz.quiz"})
@EnableFeignClients
@EnableDiscoveryClient
//@ComponentScan({"com.quiz.quiz.DAO"})
//@ComponentScan({"com.quiz.quiz.controller"})
//@ComponentScan(basePackageClasses = QuizController.class)
public class QuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
	}

}
