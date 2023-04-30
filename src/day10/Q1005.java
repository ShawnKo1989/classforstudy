package day10;

import java.util.Scanner;

public class Q1005 {

	public static void main(String[] args) {
//		키보드로 입력한 모든 소수(prime number)의 합계를 출력.
//		단, 소수 아닌 수가 입력되면, 그때까지 입력한 수들의 합을 출력 후 종료.
//		(실행결과) 소수입력: 2(엔터)
//				소수입력: 7(엔터)
//				소수입력: 13(엔터)
//				소수입력: 8(엔터)
//				지금까지 입력한 소수들의 합은 22입니다.
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
		int count = 0;
		System.out.print("소수입력 : ");
		int input = sc.nextInt();
		for(int i = 1; i<=input;i++) {
			if(input%i==0)count++;
		}
		if(count==2) sum+=input;
		if (count!=2) break;
		}
		System.out.print("지금까지 입력한 소수의 합은 "+sum+"입니다.");	
	}

}
