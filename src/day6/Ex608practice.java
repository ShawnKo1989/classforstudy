package day6;

import java.util.Scanner;

public class Ex608practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단입력 : ");
		int a = sc.nextInt();
		int mul = 1;
		for(int i = 1; i<=9;i++) {
			mul = a*i;
			System.out.println(a+" X "+i+" = "+mul);
		}
			
	}

}
