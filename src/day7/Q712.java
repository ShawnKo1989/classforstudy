package day7;

import java.util.Scanner;

public class Q712 {

	public static void main(String[] args) {

//			Q712(고급). 입력 : 4 (엔터)
//				   1
//				  2 2
//				 3 3 3
//				4 4 4 4
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		int a= input;
		
		for(int i =1; i<=input; i++) {
			for(int k = a;k>=1;k--) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i;j++) {
				System.out.print(i + " ");
			}
			System.out.println();
			a--;
		}

	}

}
