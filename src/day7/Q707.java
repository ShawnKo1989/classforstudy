package day7;

import java.util.Scanner;

public class Q707 {

	public static void main(String[] args) {
	//		Q707(고급) (실행결과) 입력 : 5 (엔터)
	//		1 2 3 4 5 
	//		6 7 8 9 
	//		10 11 12 
	//		13 14
	//		15
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		int a = 1;
		int b = input;
		
		for(int i=1;i<=input; i++) {
			for(int j =b; j>=1; j--) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
			b--;
		}

	}

}
