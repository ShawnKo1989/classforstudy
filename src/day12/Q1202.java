package day12;

import java.util.Arrays;

public class Q1202 {

	public static void main(String[] args) {
//		Q1202. 크기가 8인 실수형 배열을 만들고, 난수(0.0 이상 10.0 미만의 실수)로 채우세요.
//		① 이 배열의 내용을 출력하고
//		② 이 배열의 모든 요소의 평균을 출력해보세요.
		double[]arr= new double[8];
		double sum = 0;
		for(int i =0;i<=arr.length-1;i++) {
			arr[i]=(double)(Math.random()*10);
			sum +=arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println((double)sum/(float)(arr.length));
		
		//풀었음!!!

	}

}
