package sem4;

import sem3.A;

public class D {
	public static void main(String[] args) {
		A ob = new A();
		System.out.println(ob.a);
	}
}

class E extends A {
	public static void main(String[] args) {
		E e = new E();
		System.out.println(e.a);
		System.out.println(e.c);
	}
}

class F extends sem3.A {
	public static void main(String[] args) {
		F ob = new F();
		System.out.println(ob.a);
		System.out.println(ob.c);
	}
}

