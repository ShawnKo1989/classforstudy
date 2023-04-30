package day10;

import java.util.Scanner;

public class Q1003 {

	public static void main(String[] args) {
		//연습.
		//문자(알파벳) 하나 입력.
//		*String s = sc.next();
//		char  c = s.charAt(0);
//		(실행결과)문자입력 : S (엔터)
//		STUVWXYZ
//		(실행결과)문자입력 : w (엔터)
//		wxyz
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력 : ");
		String input = sc.next();
		char c = input.charAt(0);
		
		if(c>=65&&c<=90) {
			for(int i = c; i<='Z'; i++) {
				System.out.print((char)i+" ");
			}
		}
		else if(c>=97&&c<=122) {
			for(int i = c; i<='z'; i++) {
				System.out.print((char)i+" ");
			}
		}else 
			System.out.println("알파벳이 아니에요");
	}

}
