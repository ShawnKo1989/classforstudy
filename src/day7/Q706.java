package day7;

import java.util.Scanner;

public class Q706 {

	public static void main(String[] args) {

		//	Q706(고급) (실행결과) 입력 : 5 (엔터)
		//			AAAAA
		//			BBBB
		//			CCC
		//			DD
		//			E
		
		Scanner sc= new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		int a =input;
		char k = 'A';
		for(int i=1;i<=a; i++) {
			for(int j = input;j>=1;j--) {
				System.out.print(k+" ");
			}
			System.out.println();
			input--;
			k++;
		}
		
	}

}
