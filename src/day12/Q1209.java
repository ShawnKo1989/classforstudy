package day12;

import java.util.Arrays;

public class Q1209 {

	public static void main(String[] args) {
//		Q1209. 다섯 과목의 점수를 난수발생(0점 ~ 100점. 단, 5의 배수일 것.)하여 크기가
//		5인 배열을 채우고 총점과 평균을 출력해보세요.
//		(실행결과)
//		생성된 점수 배열 : [80, 55, 90, 70, 45]
//		총점 : 340점
//		평균 : 68.0점
		
		int[]arr=new int[5];
		int sum = 0;
		for(int i =0;i<=arr.length-1;i++) {
			arr[i]=(int)(Math.random()*100)+1;
			arr[i]=arr[i]-(arr[i]%5);
			sum+=arr[i];
		}
		System.out.print("생성된 점수 배열 : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+(double)(sum/5f));

	}

}
