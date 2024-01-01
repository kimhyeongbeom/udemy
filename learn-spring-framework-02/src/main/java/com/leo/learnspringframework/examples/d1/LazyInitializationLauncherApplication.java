package com.leo.learnspringframework.examples.d1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	
}

@Component
@Lazy
class ClassB {
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Some Initialization logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Do Something...");
	}
}


@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication{

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class);) {
			
			System.out.println("Initialization of context is completed!");
			
			Arrays.stream( context.getBeanDefinitionNames() ).forEach(System.out::println);
			ClassB classB = context.getBean(ClassB.class);
			
			classB.doSomething();
		}
	}
}

