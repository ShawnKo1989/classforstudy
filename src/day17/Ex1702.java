package day17;

public class Ex1702 {
	static int f(int n) {
		if(n==0)
			return 1;
		return n* f(n-1);
	}
	public static void main(String[] args) {
		//재귀호출(기본) : factorial 팩토리얼
		// 5! = 5*4*3*2*1 ex)
		System.out.println("4! = " + f(4));
		System.out.println("5! = " + f(5));
//		[정리]	- 문자열.length() : 문자열의 길이.
//		Ex) String s = "Hello";
//		    sysout(s.length());   // 5
//		- 문자열.charAt(int idx) : 인덱스 idx 위치의 문자.
//		Ex) sysout(s.charAt(0));  // H
//		    sysout(s.charAt(4));  // o
//		- 문자열.substring(int)
//		Ex) String s2 = s.substring(1);
//				// 인덱스#1부터 시작해서 끝까지.
//		    sysout(s2);   // ello
//		- 문자열.substring(int, int)
//		Ex) String s3 = s.substring(1,3);
//				// 인덱스#1부터 시작해서
//				// 인덱스#3이 되기 전까지.
//		    sysout(s3);   // el
	}

}
