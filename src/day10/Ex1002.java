package day10;

import java.util.Scanner;

public class Ex1002 {

	public static void main(String[] args) {
//				[정리]	1) 문자열 입력
//					sc.next() - 한 "단어" 입력
//					sc.nextLine() - 한 "문장" 입력
//				2) 문자 입력 - (없으니까 두 줄로)
//					String s = sc.next();  
//					char c = s.charAt(0);  // 나중에.
//				3) 정수 입력
//					sc.nextByte()
//					sc.nextShort()
//					☆ sc.nextInt()
//					sc.nextLong()
//				4) 실수 입력
//					sc.nextFloat()
//					sc.nextDouble()
		Scanner sc = new Scanner(System.in);
		System.out.print("나이와 이름을 순서대로 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine(); //입력버퍼 비움(참고)
		String name = sc.nextLine();
		System.out.println("입력된 내용 : 이름 ="+name);
		System.out.println("입력된 내용2 : 나이 ="+age);

	}

}
