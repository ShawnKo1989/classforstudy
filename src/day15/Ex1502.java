package day15;

import java.util.Scanner;

public class Ex1502 {
	static void showAllSum(int a,int b, int c) {
		if(b<0) System.out.print(a + " ");
		else System.out.print(a + " + ");
		
		if(c<0) System.out.print(b + " ");
		else System.out.print(b + " + ");
		
		System.out.print(c + " = ");
		
		a +=b;
		a +=c;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 : ");
		int a = sc.nextInt();			// 3(엔터)
		System.out.print("정수 2 : ");
		int b = sc.nextInt();			// 5(엔터)
		System.out.print("정수 3 : ");
		int c = sc.nextInt();			// -1(엔터)
		
		showAllSum(a,b,c);		// 3 + 5 - 1 = 
		
		System.out.println("a : "+a);

	}

}
