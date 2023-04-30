package day11;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1104 {

	public static void main(String[] args) {
//		Ex1104. 연습. 
//		(실행결과) 과목 수 입력 : 4 (엔터)
//			점수1 : 80 (엔터)
//			점수2 : 100( 엔터)
//			점수3 : 90 (엔터)
//			점수4 : 70 (엔터)
//			-> 입력한 점수 : [80, 100, 90, 70]
//			-> 총점 : 340점
//			-> 평균 : 85점             (정수형 나눗셈. 몫.)
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("과목 수입력 : ");
		int input = sc.nextInt();
		int[]scoreArr= new int[input];

		for(int i=1;i<=input;i++) {
			System.out.print("점수"+i+" : ");
			int score = sc.nextInt();
			scoreArr[i-1]=score;
			sum+=score;
		}
		System.out.println("-> 입력한 정수 : "+Arrays.toString(scoreArr));
		System.out.println("-> 총점 : " +sum);
		System.out.println("-> 평균 : "+sum/input);
		

	}

}
