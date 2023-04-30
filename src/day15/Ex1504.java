package day15;

public class Ex1504 {
	static void m1() { // void -->(비어있음) --> "리턴값이 없는 " 메서드
		System.out.println("m1.");
	}
	static int m2() {
		return 10; // "return 리턴값;" ---> 리턴문.(리턴하는문장)
	}
	static int m3() {
		return 100;
	}
	static double m4() {
		return 200;
	}
	public static void main(String[] args) {
		m1();
		int n = m2(); // 변수에 메서드를 담을수 없다. 결과를 담는다. 항상 오른쪽(메서드)을 먼저 실행한 후 작동하는 문장.
		System.out.println(n);// 하나의 메서드는 단 하나만의 리턴값을 만들수있다.
		
		
		
		
		double n2 = m3();
		
		
		
		double n3 = m4();
		
		System.out.println(n2);
		System.out.println(n3);
	}

 }
