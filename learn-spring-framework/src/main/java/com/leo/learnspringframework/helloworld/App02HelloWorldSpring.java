package com.leo.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	public static void main(String[] args) {

		System.out.println("11111");
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);) {

			System.out.println("name : " + context.getBean("name"));
			
			System.out.println("age : " + context.getBean("age"));

			System.out.println("person : " + context.getBean("person"));
			
			System.out.println("person2 : " + context.getBean("person2MethodCall"));
			
			System.out.println("person3 : " + context.getBean("person3Parameters"));
			
			System.out.println("address : " + context.getBean("address2"));

			System.out.println("Person Class : " + context.getBean(Person.class));
			
			System.out.println("address : " + context.getBean(Address.class));
			
			System.out.println("person4 : " + context.getBean("person4Parameters"));
			
			System.out.println("person5 : " + context.getBean("person5Qualifier"));
			
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}
