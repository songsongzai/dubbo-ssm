package com.groot.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	 public static void main(String[] args) throws IOException {
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext.xml"});
	        context.start();
	        System.out.println("press any key to exit.");
	        System.in.read();
	    }
}
