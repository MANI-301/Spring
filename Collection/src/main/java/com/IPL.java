package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ipl")
public class IPL {
	@Value("1")
	private int id ;
	
	@Value("CSK")
	private String name;
	
	@Value("Yellow")
	private String color;
	
	@Value("TamilNadu")
	private String state;
	
	@Autowired
	private List<String> playersName;

	@Override
	public String toString() {
		return "IPL [id=" + id + ", name=" + name + ", color=" + color + ", state=" + state + ", playersName="
				+ playersName + "]";
	}

	
}
