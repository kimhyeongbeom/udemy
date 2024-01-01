package com.leo.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.leo.learnspringframework.game.GameRunner;
import com.leo.learnspringframework.game.GamingConsole;
import com.leo.learnspringframework.game.PacmanGame;

public class App03GamingSpringBeans {
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}
}

