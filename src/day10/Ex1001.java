package day10;

import java.util.Scanner;

public class Ex1001 {

	public static void main(String[] args) {
		//난수(random number) 발생
//		->숫자를 골라줌.
		
//		자바에서는 두가지 방식이 존재: 
//			1)"Math random()" 방식 --> "0이상 1미만의 숫자"(실수)
//				ex) 0,1,2,--> 먼저, 0부터 2.9999999사이의 값을..
//							    따라서, (int)(Math.random()*3)
//				ex) 1,2,3,4,5 -> 먼저, 0,1,2,3,4(0부터..로 바꿔)
//								 0부터 4.999999 사이의 값을..
//								  따라서, (int)(Math.random()*5)+1
//			2)Random 클래스 방식
//				-Random 객체 생성문 : "Random rd = new Random();"
//					cf) "Scanner sc = new Scanner(System.in);"
//				-rd.nextInt(10)--> 0 이상 9이하의 정수.
//				-rd.nextInt()----> int형 표현범위 내의 값.
//				                   (-21억~+21억)
//				-rd.nextDouble() -> 0이상 1미만의 수.
	//			Scanner 클래스
	//
		//		(review) "Scanner sc = new Scanner(System.in);"  // 스캐너 객체 생성문.
		//				 	- int n = sc.nextInt();  // 정수 값 입력.
		//			 		- String s = sc.next();  // 문자열 입력.
	//
		//		[정리]	1. 스캐너는 '입력버퍼'를 바라보고 있음. (키보드를 직접 보는 게 아님)
		//				2. 스캐너를 사용해서 입력 받을 때, 
		//			  	 입력버퍼가 비어있는 상태라면 커서를 보여주고 입력을 기다림.
		//			   	(입력버퍼에 무언가 있으면, 그걸 가져옴)
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열입력 : ");
		
//		String s1 = sc.nextLine(); // 한 '문장'을 입력받음 : 오늘이 금요일 이었다면
		String s1 = sc.next(); 	//한단어만 입력된다
		System.out.print("입력받은 문자열: " + s1);
		
		
		String s2 = sc.next();
		System.out.print("\n입력받은 두번째 문자열 : "+s2);
		
		
		
		
		
	}

}
