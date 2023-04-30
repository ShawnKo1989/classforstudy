package day12;

import java.util.Arrays;

public class Q1210 {

	public static void main(String[] args) {
//		Q1210. 크기가 11인 정수형 배열을 만들고 난수발생(1~10 사이의 정수)해서 배열을 채우고,
//		이 배열에서 짝수가 더 많은지 홀수가 더 많은지 출력하는 코드를 작성해보세요.
//		(실행결과)
//		생성된 배열 : [8, 4, 1, 5, 9, 9, 6, 8, 2, 8, 4]
//		홀수의 개수 : 4
//		짝수의 개수 : 7
//		짝수의 개수가 더 많음!
		int[]arr= new int[11];
		int odd = 0;
		int even =0;
		for(int i =0; i<=arr.length-1; i++) {
			arr[i]=(int)(Math.random()*10)+1;
			if(arr[i]%2==1) odd++;
			else even++;
		}
		System.out.print("생성된 배열 : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("홀수의 갯수 : "+odd);
		System.out.println("짝수의 갯수 : "+even);
		System.out.println((odd>even?"홀수":"짝수")+"의 개수가 더 많음!");
		
		//풀었음!

	}

}
