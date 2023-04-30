package day18;

class Dog {	//클래스 정의
	String name;	// 이름
	void bark() {	// "멍멍" 메소드 생성
		System.out.println(name + "이가 짖었다. 멍멍!");
	}
}

public class Ex1801 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);   // 스~
		// Scanner sc : Scanner객체를 가리킬 수 있는 변수 sc의 선언.
		//Random rd = new Random();   // 랜~
		// Random rd : Random객체를 가리킬 수 있는 변수 rd의 선언.
		// "new 클래스이름()" : 객체가 생성 -> '변수와 연결'.
		Dog dog1; // Dog 객체를 가리킬수 있느느 변수 dog1의 선언.
		dog1 = new Dog();
		Dog dog2 = new Dog();
//		dog1 과 dog2 는 지역변수이다 (main 메서드소속)
		
		dog1.name = "맥스";
		dog2.name = "콩떡";
		
		dog2.bark();
	}

}
