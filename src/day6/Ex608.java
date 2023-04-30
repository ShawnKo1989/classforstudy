package day6;

import java.util.Scanner;

public class Ex608 {

	public static void main(String[] args) {
//		구구단입력 : 7 엔터
//		(실행결과) 단 입력 : 7 (엔터)
//		7 x 1 = 7
//		7 x 2 = 14
//		7 x 3 = 21
//		...
//		7 x 8 = 56
//		7 x 9 = 63
		Scanner sc = new Scanner(System.in);
		System.out.print("단입력 : ");
		int a = sc.nextInt();
		int mul = 1;
		for (int i = 1; i<=9; i++) {
			mul = a * i;
			System.out.println(a+" * "+i+" = "+mul);
		}
		
				
	}

}
