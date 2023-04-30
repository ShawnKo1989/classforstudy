package day14;

import java.util.Arrays;

public class Ex1402 {

	public static void main(String[] args) {
//		Ex1402. 2차원 배열 : 2층(행#0) : 10 20 30 / 
//		   1층(행#1) : 40 50 60
		
//		int[]arr = {10, 20, 30}; // 1차원 배열의 (간편법)
		
		int[][]arr= {
				{10,20,30},
				{40,50,60}
		};
		// ---> '행'별로 Arrays.toString을 쓰세요
		System.out.println(Arrays.toString(arr[0]));
		// 이해 : arr[0]안 (행#0인) '1차원 배열' 을 의미
		// Arrays.toString() 의 괄호() 안에는 '1차원 배열의 이름' 을..
		System.out.println(Arrays.toString(arr[1]));
		
		//연습. 
		//[10 20]
		//[20 30]
		//[50 60]
		// 간편법 사용 금지.
		int[][]arr2 = new int[3][2];
		arr2[0][0]=10;
		arr2[0][1]=20;
		arr2[1][0]=30;
		arr2[1][1]=40;
		arr2[2][0]=50;
		arr2[2][1]=60;
		for(int i =0; i<=2; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
		


	}

}
