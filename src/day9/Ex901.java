package day9;

import java.util.Scanner;

public class Ex901 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int count = 0;
		boolean b = false;
		
		for (int i = 1; i <=num; i++) {
//			System.out.print(i + " ");
			if (num%i==0) {
				count++;
			}
			
		}
		if (count ==2)
		System.out.println("소수임");
		else
		System.out.println("소수가아님.");
	}

}
