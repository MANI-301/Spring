package springlast;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("h")
public class Hotel {
	
	@Value("pandiyas")
	private String name;
	
	@Value("vadapalni")
	private String loc;
	
	@Value("89384765")
	private long phone;
	
	@Autowired
	@Qualifier("veg")
	Map<String, Double> nonvegmenu;

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", loc=" + loc + ", phone=" + phone + ", nonvegmenu=" + nonvegmenu + "]";
	}
	
	
	

}
