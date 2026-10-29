package sem6;

class Hobbies {
	String h1;
	String h2;
	
	public Hobbies(String h1, String h2) {
		this.h1 = h1;
		this.h2 = h2;
	}

	@Override
	public String toString() {
		return "Hobbies [h1=" + h1 + ", h2=" + h2 + "]";
	}
}
class Address {
	String a1;
	String a2;
	public Address(String a1, String a2) {
		super();
		this.a1 = a1;
		this.a2 =a2;
	}
	@Override
	public String toString() {
		return "Address [a1=" + a1 + ", a2=" + a2 + "]";
	}
}
class Emp {
	String name;
	int id;
	Hobbies hobbies;
	Address address;
	 
	public Emp(String name, int id, Hobbies hobbies, Address address) {
		
		this.name = name;
		this.id =  id;
		this.hobbies = hobbies;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", hobbies=" + hobbies + ", address=" + address + "]";
	}
	
}
public class Main {
	public static void main(String[] args) {
		Address address = new Address("abc","def");
		Hobbies hobbies = new Hobbies("sing", "dance");
		Emp emp = new Emp("tom",12,hobbies,address);
		System.out.println(emp.hobbies.h2);
	}

}
