package practice;

import java.util.Scanner;

public class ExceptionCase {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		try {
			System.out.println("a/b.....a?");
			int n1 = kb.nextInt();
			System.out.println("a/b.....b?");
			int n2 = kb.nextInt();
			System.out.printf("%d / %d = %d \n", n1,n2,n1/n2);
		}catch(Exception e) {
			System.out.println("잘못된입력");
		}
		
		System.out.println("Good Bye!!!");
	}
}
