package day22;
class A {				// 부모클래스(상위클래스,기본클래스(base)
	void m1() {
		
	}
	void m2() {
		
	}
}
class B extends A{		// 자식클래스(하위클래스,파생클래스(derived))
//	void m1() {	}
//	void m2() {	}
	void m3() {
		
	}
}
public class Ex2201 {

	public static void main(String[] args) {
		A obj = new A();
		obj.m1();
		obj.m2();
		B obj2 = new B();
		obj2.m1();
		obj2.m2();
		obj2.m3();
		
	}

}
