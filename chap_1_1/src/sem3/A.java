package sem3;

public class A {
	public int a = 10;
	private int b = 10;
	protected int c = 10;
	int d = 10;

	public static void main(String[] args) {
		A ob = new A();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
	}
}
 class B {
	 public static void main(String[] args) {
		 A ob = new A();
		 System.out.println(ob.a);
		 System.out.println(ob.c);
		 System.out.println(ob.d);
	 }
 }
 
 class C extends A {
	 public static void main(String[] args) {
		 C ob = new C();
		 System.out.println(ob.a);
		 System.out.println(ob.c);
		 System.out.println(ob.d);
	 }

}
