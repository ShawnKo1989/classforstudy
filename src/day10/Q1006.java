package day10;

import java.util.Arrays;

public class Q1006 {

	public static void main(String[] args) {
		//연습
//		1) String[]arr;  //문자열 배열을 가린킬 변수를 선언
//		2) arr = new String[3]; // 배열 생성 - 변수연결.
//		3) arr[0] = "YG";...
//		4) 출력,3가지 방법 중 하나로.
//
//		(실행결과)[정_윤,권_희,김_환]
		
//		[암기]	
//		배열객체 생성문 정리 (3가지 모두 암기):
//			1) int[] arr = new int[3];
//				- int[] arr;
//				- arr = new int[3] // OKAY
						
//			2) int[] arr = new int[] {10,20,30};
//				- int[] arr;
//				- arr = new int[] {10,20,30};  // OKAY
		
//			3) int[] arr = {10,20,30};  //간편법
//				- int{} arr;
//				- arr = {10,20,30}; //ERR
		
		String[]arr= new String[] {"고승우","김지희","안정섭"};
		for(int i=0; i<=2;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		

	}

}
