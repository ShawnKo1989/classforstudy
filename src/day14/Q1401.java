package day14;

import java.util.Arrays;

public class Q1401 {

	public static void main(String[] args) {
//		Q1401. 연습1(고급).
//		아래의 빈칸에 코드를 작성해서
//		제시된 실행결과를 만들어보세요.
//		--------------------------------------------
//		int[] arr1 = { 1, 3, 5, 7 };
//		/* 여기에 코드를 작성하세요 */
//		
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
//
//		int[] arr3;
//		/* 여기에 코드를 작성하세요 */
//
//		System.out.println(Arrays.toString(arr3));
//		--------------------------------------------
//		   (실행결과)
//		   arr1 : [1, 3, 5, 7]
//		   arr2 : [6, 4, 2]
//		   arr3 : [1, 3, 5, 7, 6, 4, 2]
		
		int[] arr1 = {1, 3, 5, 7};
		int[] arr2 = {6, 4, 2};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3;
		arr3 = new int[arr1.length+arr2.length];
		
		for(int i=0;i<=arr3.length-1; i++) {
			if(i<=arr1.length-1) {
				arr3[i]=arr1[i];
			}
			if(i<=arr2.length-1) {
				arr3[arr1.length+i]=arr2[i];
			}
		}
		
		System.out.println(Arrays.toString(arr3));

	}

}
