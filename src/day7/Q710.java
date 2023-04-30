package day7;

import java.util.Scanner;

public class Q710 {

	public static void main(String[] args) {
		//		Q710(고급). 입력 : 5 (엔터)
		//	    *
		//	   ***
		//	  *****
		//	 *******
		//	*********
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		String s1 = " ";
		String s2 = "*";
		
		for(int i=input;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(s1);
			}
			System.out.println(s2);
			input--;
			s2+="**";
		}

	}

}
