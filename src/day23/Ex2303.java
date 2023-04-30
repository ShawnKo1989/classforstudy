package day23;
class A3{
	A3(){System.out.println("A3생성자가 실행됨");}
}
class B3 extends A3{
	B3(){
//		super(); 항상 포함되어있다. 파라미터 계수가 항상 0으로 생성된다.
		System.out.println("B3 생성자가 실행됨.");
	}
}
public class Ex2303 {

	public static void main(String[] args) {
		B3  obj = new B3();
		// 생성자를 호출하는 내용은 무조건 첫줄에서만 올수잇다.
		// 자식클래스의 생성자에서는 부모클래스의 생성자를 무조건/반드시! 호출해야만 한다
		// --> 안그러면 '8글자'(super();) 를 자바가 알아서 껴넣어줌!!
	}

}
