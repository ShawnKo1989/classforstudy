package day8;

import java.util.Scanner;

public class Q803 {

	public static void main(String[] args) {
//		4개의 정수를 입력받아서 (a,b,c,d) // a<c <d<b 가정
//		a부터 b까지의 정수를 출력하되, c부터  d까지는 제외하고 출력
//		(실행결과) 
//		a: 1
//		b: 10
//		c: 5
//		d: 8
//		1 2 3 4 9 10
		Scanner sc = new Scanner(System.in);
		System.out.print("a :");
		int a = sc.nextInt();
		System.out.print("b :");
		int b = sc.nextInt();
		System.out.print("c :");
		int c = sc.nextInt();
		System.out.print("d :");
		int d = sc.nextInt();
//		풀이 #1
//		while(true) {
//			if(a>b) break;
//			if(a>=c && a<=d) {
//				a++;
//				continue;
//			}
//			System.out.print(a+ " ");
//			a++;
//			
//		}
//		System.out.println();
//		풀이 #2
		for(int i= a; i<=b; i++) {
			if(i>=c&&i<=d)continue;
			System.out.print(i+" ");
		}
		
	}

}
