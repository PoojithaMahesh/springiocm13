package withoutbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Elephant {
@Value("1")
private int id;
@Value("ram")
private String name;
@Value("50quintal")
private String size;

@Autowired
private Legs legs;

@Override
public String toString() {
	return "Elephant [id=" + id + ", name=" + name + ", size=" + size + ", legs=" + legs + "]";
}


	
}
