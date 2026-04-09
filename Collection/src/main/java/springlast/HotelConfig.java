package springlast;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

public class HotelConfig {
	
	@Bean
	@Qualifier("nonveg")
	public Map<String,Double> m1(){
		
		LinkedHashMap<String, Double> l1 = new LinkedHashMap<String,Double>();
		l1.put("Chicken Biriyani",150.0);
		l1.put("Mutton Biriyani",250.0);
		return l1;
	}
	
	
	@Bean
	@Qualifier("veg")
	public Map<String,Double> m2(){
		
		LinkedHashMap<String, Double> l1 = new LinkedHashMap<String,Double>();
		l1.put("Curd rice",50.0);
		l1.put("Sambar rice",100.0);
		return l1;
		
	}

	
}
