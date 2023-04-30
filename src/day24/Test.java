package day24;
class A{
	int num = 10;
}
class B {
	int num2 = 20;
}
class C {
	A obj1;
	B obj2;
	C (A obj1, B obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
}
public class Test {

	public static void main(String[] args) {
		C obj = new C(new A(), new B());
		System.out.println(obj.obj1.num);
		System.out.println(obj.obj2.num2);
	}

}
