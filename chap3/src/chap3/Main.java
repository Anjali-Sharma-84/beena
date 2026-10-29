package chap3;

class Emp {

	private String name;
	private double sal;
	private int id;
	
	public void setName(String name) {
		this.name=name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	}
public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setId(12);
		emp.setName("tom");
		emp.setSal(25000);
		System.out.println(emp.getId());
	}
	
}

	
	