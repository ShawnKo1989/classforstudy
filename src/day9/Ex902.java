package day9;

import java.util.Scanner;

public class Ex902 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		boolean b = false;
		
		for (int i = 2; i <=num-1; i++) {
			if (num%i==0) {
				b= true;
				break;
			}
			
		}
		if (b == false)
		System.out.println("소수임");
		else
		System.out.println("소수가아님.");

	}

}
