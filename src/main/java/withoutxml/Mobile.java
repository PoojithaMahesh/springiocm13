package withoutxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

    @Value("1")
	private int id;
    @Value("oneplus")
	private String name;
    @Value("60")
	private String ram;
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", ram=" + ram + "]";
	}
	
	
}
