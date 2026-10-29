package sem2;

class Student {
	String name;
	int rollno;
	static String fees;
	static double subject;

	void showInfo() {
		System.out.println(name);
		System.out.println(rollno);
	}

	static void displayInfo() {
		System.out.println(fees);
		System.out.println(subject);
	}
}

public class Main {
	public static void main(String[] args) {
		Student ob = new Student();
		System.out.println(ob.name);
		System.out.println(ob.rollno);
		System.out.println(Student.fees);
		System.out.println(Student.subject);

		ob.showInfo();
		Student.displayInfo();
	}
}
