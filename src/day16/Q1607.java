package day16;

import java.util.Scanner;

public class Q1607 {
	static int max(int a, int b, int c) {
		int max =0;
		if(a>b&&a>c) max = a;
		if(b>c&&b>a) max = b;
		if(c>a&&c>b) max = c;
		return max;
	}
	public static void main(String[] args) {
//		Q1607) (������) �Է�1 : 5 (����)
//		�Է�2 : -10 (����)
//		�Է�3 : 17 (����)
//		�ִ� �� = 17
//		(main�޼����� ������ ��)
//		System.out.println("�ִ� �� = " + max(a, b, c));
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� 1 : ");
		int a = sc.nextInt();
		System.out.print("�Է� 2 : ");
		int b = sc.nextInt();
		System.out.print("�Է� 3 : ");
		int c = sc.nextInt();
		
		System.out.println("�ִ밪 = " + max(a, b, c));

	}

}
