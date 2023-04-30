package day6;

import java.util.Scanner;

public class Ex604practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반복횟수를 입력하세요 : ");
		int a = sc.nextInt();
		
		for(int i=1;i<=a; i++) {
			System.out.println(i +"번 반복");
		}
		System.out.println("반복끝.");
	}

}
