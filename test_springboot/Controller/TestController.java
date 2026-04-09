package edu.jsp.test_springboot.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping(value ="./get",method=RequestMethod.GET)
	public String m1() {
		return "Response feom Backend";
	}
	
	
	@RequestMapping(value ="getId")
	public String m2(@RequestParam int id) {
		return "Id =" + id;
		
	}
	
	@RequestMapping(value = "getempdetails")
	public String m3(@RequestParam int id,@RequestParam String name) {
		return "Id =" + id + ", Name =" + name;
	}
	
	public Employee empDetails() {
		Employee e = new Employee();
		e.setId(1);
		e.setName("Mani");
		e.setSal(20000);
		return e;
	}
	
	// http://localhost:8080/get
	@RequestMapping(value ="getName/{name}")
	public String m4(@PathVariable String name) {
		return "name =" + name;
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public Employee saveEmployee(@RequestBody Employee e) {
		return e;
	}

}
