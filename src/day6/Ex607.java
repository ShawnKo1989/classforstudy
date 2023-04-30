package day6;

import java.util.Scanner;

public class Ex607 {

	public static void main(String[] args) {
		//a부터 b까지의 누적합, 누적곱
		Scanner sc = new Scanner(System.in);
		System.out.print("a입력 : ");
		int a = sc.nextInt();
		System.out.print("b입력 : ");
		int b = sc.nextInt();
		int sum = 0;
		int mul = 1;
		for (int i = a; i<=b; i++) {
			sum += i;
		}
		for (int i = a; i<=b; i++) {
			mul *= i;
		}
		System.out.println(a+"부터 "+b+"까지의 누적합" +sum);
		System.out.println(a+"부터 "+b+"까지의 누적곱" +mul);
	}

}
