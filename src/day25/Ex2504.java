package day25;
class A3{
	int n;
	static int n2;
	static B3 obj;
	A3(B3 obj){
		this.obj = obj;
	}
}
class B3{
	int n2;
	B3(int n2){
		this.n2 = n2;
	}
}
public class Ex2504 {
	public static void main(String[] args) {
		B3 obj = new B3(55);
		A3 obj2 = new A3(obj);
//		System.out.println(A3.n); ERR
		System.out.println(A3.n2);
		System.out.println(obj.n2);
		System.out.println(obj2.obj.n2);
		System.out.println(obj2.n2);
	}

}
