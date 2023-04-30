package day7;

import java.util.Scanner;

public class Q701 {

	public static void main(String[] args) {

//		Hint. 일단은, 문제를 쉽게 변형해서 풀어보실게요.(해결)
//		_
//		_ _
//		_ _ _
//		_ _ _ _
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 : ");
//		int input = sc.nextInt();
//		for (int i=1,k=0;i<=input;i++,k++) {
//			for(int j=1+k; j<=i+k; j++) {
//				System.out.print("_"+" ");
//			}
//			System.out.println();
//		}
		
//		Q701.	고급.
//		(실행결과) 입력 : 4 (엔터)
//		1
//		2 3
//		4 5 6
//		7 8 9 10
//				
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		for (int i=1,k=0;i<=input;i++,k++) {
			for(int j=1; j<=i;j++) {
				System.out.print(j+k +" ");
			}
			System.out.println();
			i+=k;
				
		}
		
		
		
		
		
	}

}
