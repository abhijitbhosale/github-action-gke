package com.githubaction.code.githubactiongke;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionGkeApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(GithubActionGkeApplication.class, args);
		System.out.println("####################  GithubActionGkeApplication Main Called ##################");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("####################  GithubActionGkeApplication run Called ##################");
		System.exit(0);
	}
}
