package day14;

import java.util.Arrays;
import java.util.Scanner;

public class Q1403 {

	public static void main(String[] args) {
//		Q1403. 연습3(고급). 배열을 하나 만든 후,
//		arr1 : [1, 3, 2, 4, 5]
//		  사용자로부터 입력받은 값을 네 번째 요소에 추가.
//		  아래와 같은 실행결과가 되도록 코드를 채워보세요.
//		------------------------------------------------
//		int[] arr1 = /* 여기에 코드를 작성 */ ;
//		/* 여기에 코드를 작성 */
//		System.out.println("arr2 : " + Arrays.toString(arr2));
//		/* 여기에 코드를 작성 */
//		System.out.println("arr1 : " + Arrays.toString(arr1));
//		------------------------------------------------
//		(실행결과)
//		네 번째 요소에 추가할 숫자 입력 : 7 (엔터)
//		arr2 : [1, 3, 2, 7, 4, 5]
//		arr1 : [1, 3, 2, 7, 4, 5]
		
		int[]arr1 = {1,3,2,4,5};
		int[]arr2 = new int[arr1.length+1];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("네번째 요소에 추가할 숫자 입력 : ");
		int input = sc.nextInt();
		
		for(int i =0; i<=arr2.length-1; i++) {
			if(i<3) arr2[i]=arr1[i];
			if(i==3) arr2[i]=input;
			if(i>3) arr2[i]=arr1[i-1];
		}

		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		arr1=arr2;
		
		System.out.println("arr1 : " + Arrays.toString(arr1));
	}

}
