package com.leo.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacmanGameQualifier")
public class PacmanGame implements GamingConsole {

	public void up() {
		System.out.println("Going up");
	}
	public void down() {
		System.out.println("Going down");
	}
	public void left() {
		System.out.println("Going left");
	}
	public void right() {
		System.out.println("Going right");
	}
}
