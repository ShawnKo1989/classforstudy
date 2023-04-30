package day7;

import java.util.Scanner;

public class Q711 {

	public static void main(String[] args) {
		//		Q711(고급). 입력 : 4 (엔터)
		//		*******
		//		 *****
		//		  ***
		//		   *
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		String s2 = " ";
		int a = input;
				
		for(int i=1; i<=a;i++) {
			String s = "";
			int k =1;
			int star =1;
			for(k=1,star=1; k<input;k++,star+=2) {
			}
			for(int h=1; h<=star;h++) {
				s+="*";
			}
			for(int j=1; j<=i;j++) {
				System.out.print(s2);
			}
			System.out.println(s);
			input--;

		}

	}

}
