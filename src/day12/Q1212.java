package day12;

import java.util.Arrays;
import java.util.Scanner;

public class Q1212 {

	public static void main(String[] args) {
//		Q1212. (고급) 위 Q1211을 네 번 돌렸을 때 ‘최대값-최소값’이 가장 크게 되는 경우의 ‘최대값-최소값’을 출력해보세요.
//		(실행결과)
//		'최대값-최소값'의 최대값 = 48
		Scanner sc = new Scanner(System.in);
		System.out.print("난수(51~100)를 몇회 출력하시겠습니까? : ");
		int input = sc.nextInt();
		int[]arr=new int[10];
		int[]gapOfgap=new int[input];
		int count =0;
		int maxOfmax =0;
		int minOfmin =100;
		while(count!=input) {
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
			int gap = max-min;
			System.out.println("최대값 - 최소값 = "+max+" - "+min+" = "+gap);
			gapOfgap[count]=gap;
			count++;
			System.out.println();
		}
		System.out.println(Arrays.toString(gapOfgap));
		for(int i=0;i<=gapOfgap.length-2;i++) {
			for(int j=i+1;j<=gapOfgap.length-1;j++) {
				if(gapOfgap[i]>gapOfgap[j]&&gapOfgap[i]>maxOfmax) {
					maxOfmax=gapOfgap[i];
				}
				else if(gapOfgap[i]<gapOfgap[j]&&gapOfgap[i]<minOfmin) {
					minOfmin=gapOfgap[i];
				}
			}
		}
		System.out.println("'최대값-최소값'의 최대값 ="+(maxOfmax));
		System.out.println("'최대값-최소값'의 최소값 ="+(minOfmin));
		
		//풀었음.
	}

}
