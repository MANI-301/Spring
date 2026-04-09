package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ListConfig {
	@Bean
	public List<String> m1(){

		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("jadeja");
		a1.add("Dhoni");
		a1.add("Ruturaj");
		return a1;
		
}
}