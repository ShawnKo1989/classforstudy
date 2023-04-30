package day23;
class A2{
	int a, b, c;
	A2(){this(100,100,100);}
	A2(int a){this.a = a;}
	A2(int a, int b){this.a = a; this.b = b;}
	A2(int a, int b, int c){this.a = a; this.b = b; this.c =c;}
}
class B2 extends A2{
	super.A2();
	B2(){this(10,10,10);}
}
public class Ex2302 {

	public static void main(String[] args) {
		A2 obj = new A2();
		B2 obj2 = new B2();
		System.out.println(obj.a + " " +obj.b + " "+obj.c);
	}

}
