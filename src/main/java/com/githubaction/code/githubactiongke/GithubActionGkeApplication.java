package com.githubaction.code.githubactiongke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionGkeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubActionGkeApplication.class, args);
		System.out.println("####################  GithubActionGkeApplication Main Called ##################");
	}

}
