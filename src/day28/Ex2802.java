package day28;
// 추상메서드가 있는 클래스는 '(완성된) 클래스' 일수없다.
// 추상클래스는 추상메서드가 1개 이상 있어야된다.
// 추상클래스를 상속받는 클래스에서는 반드시 추상메서드를 구현(body를 완성) 해야한다
abstract class AC1{		//추상클래스 : 미완성 내용 (메서드)를 포함할수있다.

	void m1() {
		System.out.println("m1.");
	}
	abstract void m2(); // '추상메서드'
}
 class B2 extends AC1{
	 @Override
	 void m2() {
		 System.out.println("m2.");
	 }
 }
public class Ex2802 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AC1 obj = new AC1(); ERR
		B2 obj = new B2();
		obj.m1();
		obj.m2();
	}

}
