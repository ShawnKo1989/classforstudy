package day16;

public class Q1603 {
	static int mulInt(int a, int b) {
		a = a*b;
		return a;
	}
	static double mulDouble(double a, double b) {
		a = a*b;
		return a;
	}
	public static void main(String[] args) {

//			Q1603) mulInt 메서드를 정의 / mulDouble 메서드를 정의
//			파라미터 : 정수 두 개. 파라미터 : 실수 두 개.
//			리턴 : 두 값의 곱. 	리턴 : 두 값의 곱.
//			main():
//			- sysout( mulInt (3, 4) );
//			- sysout( mulDouble (3.5, 7) );
		System.out.println(mulInt(3,4));
		System.out.println(mulDouble(3.5,7));

	}

}
