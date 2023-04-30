package day12;

import java.util.Arrays;

public class Q1201 {

	public static void main(String[] args) {
//		Q1201. 크기가 5인 정수형 배열을 만들고, 난수(1 이상 5 이하의 정수)로 채우세요. 
//		① 이 배열의 내용을 출력하고 
//		② 이 배열의 모든 요소의 총합을 출력해보세요.
		int[]arr = new int[5];
		int sum = 0;
		for(int i = 0; i<=arr.length-1;i++) {
			arr[i]=(int)(Math.random()*5)+1;
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
		
		//풀엇음!
	}

}
