package day15;

import java.util.Scanner;

public class Ex1503practice {
	static void showAllSum(int[]a) {
		System.out.print(a[0]+" + "+a[1]+" + "+a[2]+" = ");
		System.out.println(a[0]+a[1]+a[2]);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]arr = new int[3];
		System.out.print("정수 1 : ");
		arr[0] = sc.nextInt();
		System.out.print("정수 2 : ");
		arr[1] = sc.nextInt();
		System.out.print("정수 3 : ");
		arr[2] = sc.nextInt();
		
		showAllSum(arr);

	}

}
