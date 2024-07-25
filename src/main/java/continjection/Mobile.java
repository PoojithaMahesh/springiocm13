package continjection;

public class Mobile {

	private int id;
	private String name;
	private String address;
	
	public Mobile(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
