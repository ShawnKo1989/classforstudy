package day14;

//메서드의 정의와 호출
public class Ex1405 {
	static void methodA() { // --->메서드 methodA()를 "정의"
		System.out.println("메서드 A가 실행됨.");
	}
	static void methodB() {
		System.out.println("메서드 B가 실행됨.");
	}
	public static void main(String[] args) {
		//메서드(method)
//		-작은 코드 조각
//		- "정의"/"호출"(사용)
		System.out.println("main 메서드가 시작됨.");
		methodA(); // -------------> methodA라는 이름의 메서드를 "호출"
		methodA();
		methodB(); // ------> methodB가 실행됨!
	}

}
