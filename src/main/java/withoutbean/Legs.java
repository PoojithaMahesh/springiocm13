package withoutbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Legs {
    @Value("1")
	private int id;
    @Value("frontleg")
	private String name;
	@Override
	public String toString() {
		return "Legs [id=" + id + ", name=" + name + "]";
	}
	
}
