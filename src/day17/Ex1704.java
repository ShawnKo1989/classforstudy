package day17;
public class Ex1704 {
	static void m() {
		int num = 5;
	}
	static void m2(int a) {  // 파라미터 int a는 지역변수이다.
		System.out.println(a);
//		System.out.println(num); 
//		ERR
//		System.out.println(num2);
//		ERR
	}
	public static void main(String[] args) {
		for(int i = 1; i<=3; i++) {
			//for 문의 괄호 () 안에서 선언된 int i는 해당 for문 안에서만 살아있음.
		}
//		System.out.print(i + " "); //4 ERR
		
//		메서드 중괄호 안의 선언된 변수는 해당 메서드 안에서만 살아있음.
		m();
//		System.out.println(num); // ERR
		
		// if문의 중괄호 안에서 선언된 변수는 해당 중괄호 안에서만 살아있다.
		if(1==1) {
			int num2 = 55; 
		}
//		System.out.println(num2); ERR 중괄호 안에있는 변수이다.
		
//		메서드의 파라미터(parameter)는 지역변수이다 !!! 중요!!!
//		---> 해당 중괄호 안에서만 살아잇다.
		m2(555);
//		System.out.println(a); ERR 
		
	}

}
