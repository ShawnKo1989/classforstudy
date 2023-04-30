package day11;

import java.util.Arrays;
import java.util.Scanner;

public class Q1104 {

	public static void main(String[] args) {
//		Q1104. 연습. 난수 발생(-5 ~ +5) 값을 크기가 6인 배열에 채운 후,
//		1) 배열의 내용을 출력. (단, Arrays.toString() 사용X)
//		2) 정수 하나(n)를 입력받고 그 값이 이 배열에 존재하는지 여부를 출력.
//		(실행결과) 정수(n) 입력 : 3 (엔터)
//			 배열 : [-2, 3, 4, 4, -5, -1] -> 3 있음!
//		(실행결과) 정수(n) 입력 : 4 (엔터)
//			 배열 : [2, 0, -4, -4, 5, 3] -> 4 없음!
		int[]arr= new int[6];
		for(int i=0;i<=5;i++) {
			arr[i] = (int)(Math.random()*10)-5;
		}
//		for(int i:arr) {
//			System.out.print(i+" ");
//		}
		boolean exist = false;
		Scanner sc=new Scanner(System.in);
		System.out.print("정수(n) 입력 : ");
		int input= sc.nextInt();
		System.out.print(Arrays.toString(arr)+"->");
		for(int i=0;i<=5;i++) {
			if(arr[i]==input) exist=true;
		}
		if(exist)System.out.print(input+"있음!");
		else System.out.println(input+"없음!");

	}

}
