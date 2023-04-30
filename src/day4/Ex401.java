package day4;

import java.util.Scanner;

// 자동 임포트 : [Ctrl][Shift][o]
public class Ex401 {
//Q301,Q302 복습
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(12);
//		System.out.println(0b1100);
//		System.out.println(014);
//		System.out.println(0xc);
//		System.out.println();//줄바꿈."\n"
//		
//		// 7,14,21
//		System.out.println(07);
//		System.out.println(016);
//		System.out.println(025 +"\n");
//		
//		
//		// 7,14,21
//		System.out.println(0x7);
//		System.out.println(0xe);
//		System.out.println(0x15);
//---------------------------------------------------------------------------------------------
//		화씨온도 입력받아 섭씨온도로 변환.
		
		//화씨온돈 ----> 섭씨온도  C = 5/9 * (F - 32) // F : 화씨  C: 섭씨
		Scanner sc = new Scanner(System.in); //  스캐너 객체 생성 문장.
		System.out.print("화씨온도를 입력하세요: ");
		int f = sc.nextInt(); // 스캐너 이용 객체 이용해서 정수값 입력
		//화씨 100도 --> 섭씨 ____도
		float c = 5.0f/9 *(f-32); // 5.0f 라고 안하면....
		System.out.println("화씨 "+f+" 도 --> 섭씨 "+c+" 도");
		
//		[고급]
//		소수점 첫째자리까지만 출력하는 방법
		float d = 5/9f *(f-32);
		float u = (int)(d*10)/10f;
		System.out.println("화씨 "+f+" 도 --> 섭씨 "+u+" 도");
//------------------------------------------------------------------------------------------------
//		정처산기 W2 Day2.
//
//		Today. Java (4)
//		------------------------------------------------------------------
//		Ex401. Scanner사용 -> 화씨온도 입력받아 섭씨온도로 변환.
//		(실행결과) 화씨온도를 입력하세요 : 100
//			화씨 100도 -> 섭씨 37.77778도
//
//		(고급 : Ex401의 고급)
//		(실행결과) 화씨온도를 입력하세요 : 100 (엔터)
//			화씨 100도 -> 섭씨 37.7도
//					
//		-----------------------------------------------------------------------------
//		연산자.
//			- '연산자(operator)' / '피연산자(operand)'='항'
//			  Ex) 5 + 3  ---> +:'연~' , 5와 3:'피~'
//			- 이항연산자 (항이 2개) Ex. +
//			- 단항연산자 (항이 1개) Ex. -(부호), ++
//				Ex) int a = 5;
//				     sysout(-a);   // -5
//				     sysout(a);    // 5
//			- 삼항연산자 (항이 3개) "___ ? ___ : ___"
//				Ex) int n = 5;
//				     char c = n%2==0 ? '짝' : '홀';
		
	}

}
