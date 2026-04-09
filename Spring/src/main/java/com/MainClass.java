package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml") ;
		
		Object o = context.getBean("s");
		
		 Student s1 = (Student) o;
		 
		 s1.m1();
	}
}
