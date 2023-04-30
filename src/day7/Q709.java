package day7;

import java.util.Scanner;

public class Q709 {

	public static void main(String[] args) {
//		Q709. - 조건 : i에 대한 for문을 이렇게 쓰세요:
//			for(int i=1; i<=n; i++) { ... }
//		              (이렇게 쓰지 마세요:)
//			for(int i=n; i>=1; i--) { ... }
//			(실행결과) 입력 : 4 (엔터)
//				****		
//				 ***
//				  **
//				   *
		Scanner sc= new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		int a = input;
		String s1 = " ";
		String s2 = "*";
		for(int i=1; a>=1;i++) {
			for(int j=1;j<=a;j++) {
				System.out.print(s2);
			}
			System.out.println();
			System.out.print(s1);
			a--;
			s1+=" ";
		}

}
}