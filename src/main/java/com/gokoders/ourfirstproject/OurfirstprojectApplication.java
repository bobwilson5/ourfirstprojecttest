package com.gokoders.ourfirstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OurfirstprojectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OurfirstprojectApplication.class, args);
		
		HelloService helloService = (HelloService) context.getBean("helloService");
		String greeting = helloService.greetHello(); 
		System.out.println("greeting 1 > "+greeting);
		
		//preferred method - type safe
		HelloService helloService2 = context.getBean(HelloService.class);
		String greeting2 = helloService2.greetHello(); 
		System.out.println("greeting 2 > "+ greeting2);
				
		MediaService mediaService = context.getBean(MediaService.class); 
		String media = mediaService.fetchMedia(); 
		System.out.println("media > "+media);
		  
		DependencyInjectionByPropertyImpl dibpi = context.getBean(DependencyInjectionByPropertyImpl.class);
		String media2 = dibpi.getMedia();
		System.out.println("By property >" + media2);
		
		DependencyInjectionBySetterImpl dibsi = context.getBean(DependencyInjectionBySetterImpl.class);
		String media3 = dibsi.getMedia();
		System.out.println("By setter >" + media3);
		
		DependencyInjectionByConstructorImpl dibci = context.getBean(DependencyInjectionByConstructorImpl.class);
		String media4 = dibci.getMedia();
		System.out.println("By constructor >" + media4);

	}

}
