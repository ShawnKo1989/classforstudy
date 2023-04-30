package day9;

import java.util.Scanner;

public class Q906 {

	public static void main(String[] args) {
//		Q906. (고급) 
//		※ Math.random() : "0 이상 1 미만의 수"를 골라줌.
//				   (0.0 ~ 0.9999999...)
//		  Math.random()*10 : (0.0 ~ 9.999999...)
//		  (int)(Math.random()*10) : 0,1,2,3,...,7,8,9
//		  (int)(Math.random()*10) + 1 : 1,2,3,...,8,9,10
//
//		(실행결과) 컴퓨터가 숫자를 골랐습니다. ------------> 37이라 가정.
//			 Guess(1~100) : 50 (엔터)
//			 더 작은 수를 입력하세요.
//			->(10이상 차이) 훨씬 더 작은 수를 입력하세요.
//			->(10미만 차이) 조금 더 작은 수를 입력하세요.
//			 Guess(1~100) : 25 (엔터)
//			 더 큰 수를 입력하세요.
//			->(10이상 차이) 훨씬 더 큰 수를 입력하세요.
//			->(10미만 차이) 조금 더 큰 수를 입력하세요.
		
//			 Guess(1~100) : 37 (엔터)
//			 맞췄음! 3번의 시도 끝에 맞췄습니다.
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random()*100)+1;
		int count = 0;
		while(true) {
		System.out.print("Guess(1~100) : ");
		int input = sc.nextInt();
		count++;
		if(com<input) {
			if(input-com<10) {System.out.print("조금 ");}
			else {System.out.print("훨씬 ");}
			System.out.print("작은수를 입력하시오.");
		}else if(com>input) {
			if(com-input<10) {System.out.print("조금 ");}
			else {System.out.print("훨씬 ");}
			System.out.print("큰수를 입력하시오.");
		}else if(com==input){
			System.out.print("맞췄음!"+count+"번의 시도끝에 맞췄습니다.");
			break;
		}
		System.out.println();
		}

	}

}
