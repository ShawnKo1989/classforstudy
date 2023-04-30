package day7;

import java.util.Scanner;

public class Q713 {

	public static void main(String[] args) {
	//		Q713(고급). 입력 : 5 (엔터)
	//		1
	//		01
	//		101
	//		0101
	//		10101
		Scanner sc= new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		int j=1;
		
		for(int i=1; i<=input;i++) {
			for(j=1; j<=i;j++) {
				if(i%2==0) {
					System.out.print((j%2-1)*-1);
				}else {
					System.out.print(j%2);
				}
			}
			System.out.println();
			
		}


	}

}
