package com.leo.learnspringframework.examples.e1;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {
	
}

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass {
	
}

@Configuration
@ComponentScan
public class BeanScopesLauncherApplication{
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class);) {
			//Arrays.stream( context.getBeanDefinitionNames() ).forEach(System.out::println);
			System.out.println("NormalClass : " + context.getBean(NormalClass.class));
			System.out.println("NormalClass : " + context.getBean(NormalClass.class));
			System.out.println("NormalClass : " + context.getBean(NormalClass.class));

			System.out.println("PrototypeClass : " + context.getBean(PrototypeClass.class));
			System.out.println("PrototypeClass : " + context.getBean(PrototypeClass.class));
			System.out.println("PrototypeClass : " + context.getBean(PrototypeClass.class));
			
		}
	}
}

