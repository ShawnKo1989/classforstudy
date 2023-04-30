package day12;

import java.util.Arrays;

public class Q1211 {

	public static void main(String[] args) {
//		Q1211. 크기가 10인 정수형 배열을 만들고 난수발생(51~100 사이의 정수)해서 배열을 채운 후,
		
//		1) 이 배열의 내용을 출력하고 
//		2) 이 배열의 최대 값과 최소 값의 차이를 출력.

//		(실행결과)
//		생성된 배열 : [90, 73, 60, 63, 94, 88, 93, 66, 73, 93]
//		최대값 - 최소값 = 94 - 60 = 34

		int[]arr=new int[10];
		int max =0;
		int min =100;
		for(int i = 0; i<=arr.length-1; i++) {
			arr[i]=(int)(Math.random()*50)+51;
		}
		System.out.print("생성된 배열 : ");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]&&arr[i]>max) {
					max=arr[i];
				}
				else if(arr[i]<arr[j]&&arr[i]<min) {
					min=arr[i];
				}
			}
		}
		System.out.println("최대값 - 최소값 = "+max+" - "+min+" = "+(int)(max-min));
	
		//풀었음.
	
	
	}
	
	

}
