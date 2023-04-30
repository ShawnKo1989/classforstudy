package day16;

import java.util.Scanner;

public class Q1607 {
	static int max(int a, int b, int c) {
		int max =0;
		if(a>b&&a>c) max = a;
		if(b>c&&b>a) max = b;
		if(c>a&&c>b) max = c;
		return max;
	}
	public static void main(String[] args) {
//		Q1607) (실행결과) 입력1 : 5 (엔터)
//		입력2 : -10 (엔터)
//		입력3 : 17 (엔터)
//		최대 값 = 17
//		(main메서드의 마지막 줄)
//		System.out.println("최대 값 = " + max(a, b, c));
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 1 : ");
		int a = sc.nextInt();
		System.out.print("입력 2 : ");
		int b = sc.nextInt();
		System.out.print("입력 3 : ");
		int c = sc.nextInt();
		
		System.out.println("최대값 = " + max(a, b, c));

	}

}
