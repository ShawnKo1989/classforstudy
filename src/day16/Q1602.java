package day16;

public class Q1602 {
	static int add(int a , int b) {
		a=a+b;
		return a;
	}
	public static void main(String[] args) {
//		Q1602) add 메서드를 정의.
//		- 파라미터 : 두 개의 정수 값(a, b)
//		- 리턴 : 더 파라미터 정수 값을 더한 값.
//		main():
//		- sysout( add(3, 5) );
		System.out.println(add(3 ,5));
	}

}
// 파라미터 선언만! 매번 선언을 따로한다!
// 메인에서 사용하는 지역변수는 파라미터처럼 쓸수없다.
// int a; int b; 요렇게는 연속선언이 가능하다.