package com.au.spring;

import java.io.IOException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		AbstractApplicationContext factory = new FileSystemXmlApplicationContext("spring.xml"); 	      
		factory.registerShutdownHook();
		Triangle triangle = (Triangle)factory.getBean("triangle");
		triangle.draw();
		
		triangle = null;
		
		Rectangle rectangle = (Rectangle)factory.getBean("rectangle");
		rectangle.draw();

	}

}
