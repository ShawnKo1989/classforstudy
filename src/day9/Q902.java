package day9;

import java.util.Scanner;

public class Q902 {

	public static void main(String[] args) {
//		세정수를 입력받고 a,b,c
//		세정수의 합계가
//		 짝수인지 아닌지를 출력
//		 (실행결과) a: 2
//		 		  b:3
//		 		  c: 1
//		세정수의 합이 짝수임 
//		짝수가 아님.
//		세정수의 합계가 홀수이면 다시 입력 반복
		Scanner sc =new Scanner(System.in);
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.print("c: ");
		int c = sc.nextInt();
		while((a+b+c)%2==1) {
			System.out.println("합계가 홀수입니다 다시입력해주세요.");
			System.out.print("a: ");
			a = sc.nextInt();
			System.out.print("b: ");
			b = sc.nextInt();
			System.out.print("c: ");
			c = sc.nextInt();
		}
		
		
		System.out.print("세정수의 합이 짝수");
		if((a+b+c)%2==0) {
			System.out.println("임.");
		}else
			System.out.println("가 아님.");
		
	}

}
