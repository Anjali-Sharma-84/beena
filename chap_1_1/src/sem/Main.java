package sem;

class Emp {
	String name;
	int id;
	double sal;
	String address;

	void displayInfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(sal);
		System.out.println(address);
	}

	public Emp(String name, int id, double sal, String address) {
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp("tom", 12, 24000, "nallasopara");
		emp.displayInfo();
		System.out.println(emp);
	}
}




