package day12;

import java.util.Arrays;

public class Q1203 {

	public static void main(String[] args) {
//		Q1203. 배열 [10, 20, 30, 40, 50] 을 (수업시간에 배운) 3가지 방법으로 각각 만들어 보고,
//		① Arrays.toString() 을 이용해서 출력하고
//		② 반복문을 사용해서 출력하고
//		③ for-each문을 사용해서 출력해보세요.
		
		int[]arr= new int[5];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=(i+1)*10;
		}
		System.out.println(Arrays.toString(arr));		//첫번째 방법
		
		System.out.print("[");
		for(int i:arr) {
			System.out.print(i);
			if(i<arr[arr.length-1])System.out.print(", ");
		}System.out.print("]");							//두번째방법
		
		System.out.println();
		System.out.print("[");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]);
			if(arr[i]<arr[arr.length-1])System.out.print(", ");
		}System.out.println("]");						//세번째방법

	}

}
