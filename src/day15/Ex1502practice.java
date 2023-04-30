package day15;

import java.util.Scanner;

public class Ex1502practice {
	static void showAllSum(int a, int b, int c) {
		System.out.print(a+" + "+ b+ " + "+c+" = ");
		a+=b;
		a+=c;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1  : ");
		int a = sc.nextInt();
		System.out.print("정수 2  : ");
		int b = sc.nextInt();
		System.out.print("정수 3  : ");
		int c = sc.nextInt();
		
		showAllSum(a,b,c);
		
		System.out.println("a 의값은 :" +a + ",b의 값은 :"+b+",c의 값은 :"+c);
		

	}

}
