package day7;

import java.util.Scanner;

public class Q708 {

	public static void main(String[] args) {
//		Q708. (실행결과) 입력 : 4 (엔터)			// 'Consolas'
//				    *
//				   **
//				  ***
//				 ****
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int input = sc.nextInt();
		String c = "*";
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=input-i;j++) {
				System.out.print(" ");
			}
			System.out.print(c);
			System.out.println();
			c+="*";
		}

	}

}
