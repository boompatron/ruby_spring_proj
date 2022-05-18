package com.rubypaper.Chapter01;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chapter01Application {

	public static void main(String[] args) {
		// run as java application
		// no conflict even multiple run
		// if WebApplicationType.SERVLET => run as web or undo
//		SpringApplication application = new SpringApplication(Chapter01Application.class);
//		application.setWebApplicationType(WebApplicationType.SERVLET);
//		application.setBannerMode(Banner.Mode.OFF);	// Hide Spring Banner
//		application.run(args);

		// run as web application
		SpringApplication.run(Chapter01Application.class, args);
	}

}
