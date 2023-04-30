package day7;

import java.util.Scanner;

public class Q702 {

	public static void main(String[] args) {
//		Q702.	(실행결과) 몇의 배수를 출력할까요? 5 (엔터)
//				5 10 15 20 25 ... 95 100          // 1 ~ 100 정수들 중에서..
//			(실행결과) 몇의 배수를 출력할까요? 11 (엔터)
//				11 22 33 ... 88 99
		Scanner sc= new Scanner(System.in);
		System.out.print("몇의 배수를 출력할까요? ");
		int input = sc.nextInt();
		
		for(int i = 1; i<=100; i++) {
			if(i%input==0) {
				System.out.print(i + " ");
			}
		}
	}

}
