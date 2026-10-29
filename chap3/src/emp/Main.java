package emp;

class Rollno {
	String r1;
	String r2;

	public Rollno(String r1, String r2) {
		super();
		this.r1 = r1;
		this.r2 = r2;
	}

	@Override
	public String toString() {
		return "Rollno [r1=" + r1 + ", r2=" + r2 + "]";
	}
}

class Div {
	String d1;
	String d2;

	public Div(String d1, String d2) {
		super();
		this.d1 = d1;
		this.d2 = d2;
	}

	@Override
	public String toString() {
		return "Div [d1=" + d1 + ", d2=" + d2 + "]";
	}
}

class Emp {
	String name;
	int id;
	Rollno rollno;
	Div div;

	public Emp(String name, int id, Rollno rollno, Div div) {
		super();
		this.name = name;
		this.id = id;
		this.rollno = rollno;
		this.div = div;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		Rollno rollno = new Rollno("abc", "def");
		Div div = new Div("sing", "dance");
		Emp emp = new Emp("tom", 12, rollno, div);
		System.out.println(emp.div.d2);
	}
}
