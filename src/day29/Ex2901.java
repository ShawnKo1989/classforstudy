package day29;
class A{				// 외부클래스 (Outer class)
	private int num =10;
	class B{			// 중첩클래스 (Nested class)또는 내부클래스 (Inner class)
		void showNum() {
			System.out.println("num : "+ num);
		}
	}
}
public class Ex2901 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		A.B obj = a.new B();
		
		obj.showNum();
	}

}
