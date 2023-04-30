package day15;

public class Ex1501 {
	static void m2(int n, String m,  double k){	//파라미터(parameter) - 매개변수
		System.out.println(n);	//55
		System.out.println(m);	//3
		System.out.println(k);  // 5.0 자동형변환되어 실수타입으로 출력된다.
	}
	static void sayHello(String m) {
		System.out.println("Hello "+m+ "!");
	}
	public static void main(String[] args) {
//		파라미터와 인수 (parameter & argument)

		m2(55, "3", 5); //인수 (argument) - 파라미터에 전해주는 구체적인 값.
		// 항상 변수와 값이 일치해야된다. ex) String = "__"
		// 자동형변환도 이뤄질수있다.
		// 값의 초기화라고 생각할수있다.
		
		sayHello("YG"); // Hello YG! 가 되도록 출력
		
	}

}
