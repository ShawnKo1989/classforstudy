package day29;
class A2{				// 외부클래스(Outer class)
	private static int num = 10;
	static class B2{	// 중첩클래스 중 "스태틱 클래스" (Static class)
		void showNum() {
			System.out.println("num : "+ num);
		}
	}
	class A3{
		void m() {
			int n = 5;
			class B3{
				void showNum() {
					System.out.println("n : "+ n);
				}
			}
		}
	}
}
public class Ex2902 {
	public static void main(String[] args) {
		A2.B2 obj = new A2.B2();	// 기억
		obj.showNum();
		A3 obj = new A3();
		obj.m();
	}
}
