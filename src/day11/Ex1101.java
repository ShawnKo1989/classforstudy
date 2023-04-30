package day11;

import java.util.Arrays;
import java.util.Random;

public class Ex1101 {

	public static void main(String[] args) {
//		배열 -->사용법(문법),완벽하게!
//		연습 크기가 10 인 정수형 배열에 1~6 사이의 정수 (난수발생)로 채우고 배열출력.
//		
		Random rd= new Random();
		int[]arr= new int[10];
		for(int i=0;i<=9;i++) {
//			arr[i]=(int)(Math.random()*5)+1; // 첫번째방법
			arr[i]=rd.nextInt(6)+1;
		}
		System.out.print(Arrays.toString(arr));
	}

}
