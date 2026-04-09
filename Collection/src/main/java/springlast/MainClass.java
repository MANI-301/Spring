package springlast;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("Hotel.class");
		
		Hotel h = (Hotel) context.getBean("h");
		
		System.out.println(h);
	}
}
