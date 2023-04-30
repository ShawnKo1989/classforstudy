package day14;

import java.util.Arrays;

public class Ex1403 {

	public static void main(String[] args) {
//		Ex1403. 2차원 배열의 연습.
//		1) 만들어 출력.
//		(실행결과) 1 2 3 
//			 4 5 6
//			 7 8 9
		int[][]arr3=new int[3][3];
		arr3[0][0]=1;
		arr3[0][1]=2;
		arr3[0][2]=3;
		arr3[1][0]=4;
		arr3[1][1]=5;
		arr3[1][2]=6;
		arr3[2][0]=7;
		arr3[2][1]=8;
		arr3[2][2]=9;
		
		for(int i =0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(arr3[i][j]+" ");
			}System.out.println();
		}
		
//		2) 이렇게 출력
//		(실행결과)   [1, 2, 3]
//			   [4, 5, 6]
//			   [7, 8, 9]
		
		for(int i=0;i<=2;i++) {
			System.out.println(Arrays.toString(arr3[i])+" ");
		}
//		
//		3) 모든 요소의 값을 10배(값을 변경)한 후 출력.
//		(실행결과)   [10, 20, 30]
//			   [40, 50, 60]
//			   [70, 80, 90]
		for(int i=0;i<=2;i++) {
			for(int j =0;j<=2;j++) {
				arr3[i][j]*=10;
			}
		}
		for(int i=0;i<=2;i++) {
			System.out.println(Arrays.toString(arr3[i])+" ");
		}
//		4) 모든 요소의 합 = ________________________
//		5) 모든 요소의 평균 = _________________________
		
		int sum =0;
		for(int i =0;i<=2;i++) {
			for(int j =0;j<=2; j++) {
				sum += arr3[i][j];
			}
		}
		System.out.print("모든 요소의 합 = "+ sum);
		System.out.print("\n모든 요소의 평균 = "+ (double)sum/9);
		
//		6) 최대 값 = _____
//		7) 최소 값 = _____
		
		int max = arr3[0][0];
		int min = arr3[0][0];
		for(int i =0; i<=2; i++) {
			for(int j=0; j<=2;j++) {
				if(arr3[i][j]>max) max=arr3[i][j];
				if(arr3[i][j]<min) min=arr3[i][j];
			}
		}
		System.out.print("\n최대값 = " +max);
		System.out.print("\n최소값 = " +min);

	}

}
