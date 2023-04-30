package day10;

import java.util.Scanner;

public class Q1004 {

	public static void main(String[] args) {
	//		키보드로 입력한 모든 정수의 합계를 출력.
	//		단, 0을 입력하면 (그때까지의 합계를 출력하고) 끝.
	//		(실행결과) 입력: 5(엔터)
	//				입력 : 12 (엔터)
	//				입력 : -10(엔터)
	//				입력 : 0 (엔터)
	//				지금까지의 입력한 값들의 합은 10입니다.
	//				(고급)지금까지 입력한 값들의 합은 5+12-10=7
//					(고급: 배열) 중복된값이 입력되었으면, 중복아닌 값이 입력될까지 반복해서 입력
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count =0;
		int[] numArray = new int[50];
		while(true) {
		System.out.print("입력 : ");
		int input = sc.nextInt();
		for(int i=0;i<=count;i++) {
			if(numArray[i]==input) {
				System.out.println("중복된값을 입력하였습니다. 다시입력해주세요.");
				System.out.print("입력 : ");
				input = sc.nextInt();
			}else break;
		}
		if(input>0||input<0) {
			sum+=input;
			numArray[count]=input;
			count++;
		}
		else break;
		}
		System.out.println("지금까지 입력한 값들의 합은 "+sum+ "입니다.");
		System.out.print("지금까지 입력한 값들의 합은 ");
		for(int i = 0; i<=count; i++) {
			System.out.print(numArray[i]);
			if(i<count)System.out.print("+");
			if(i==count)System.out.print("=");
		}System.out.print(sum);
	}

}
