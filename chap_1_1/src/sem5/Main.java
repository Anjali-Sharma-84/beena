package sem5;;

class Acc{
	
	void calSal(double sal) {
		System.out.println(sal);
	}
	
	 void calSal(double sal, double bonus) {
System.out.println(sal + bonus);
		 
	}
}

class Emp extends Acc{

	@Override
	void calSal(double sal) {
		super.calSal(sal);
	}
}
public class Main {
public static void main(String[] args) {
	Acc acc = new Acc();
	acc.calSal(12);
	acc.calSal(12, 1);
	
	Emp emp = new Emp();
	emp.calSal(12);
}


	
}
