package day7;

import java.util.Scanner;

public class Q705 {

	public static void main(String[] args) {

		//Q705.	(실행결과) 입력 : 4 (엔터)
		//		****
		//		***
		//		**
		//		*
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		int a = input;
		
		for(int i = 1; i<=a; i++) {
			for(int j= input; j>0;j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
			input--;
		}


	}

}
