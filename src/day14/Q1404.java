package day14;

import java.util.Arrays;

public class Q1404 {

	public static void main(String[] args) {

//		Q1404. 연습4(고급). 2차원 배열(3x3)을 난수발생(1~9) 해서 채운 후,
//		1) 출력. (형식은 자유)
//		2) (위 배열을) 시계방향으로 90도 회전해서 출력.
//		3) (위 1)의 배열을) 반시계방향으로 90도 회전해서 출력.

		int[][]arr= new int[3][3];
		for(int i =0;i<=2;i++) {
			for(int j=0; j<=2; j++) {
				arr[i][j]= (int)(Math.random()*9)+1;
			}
		}for(int i =0;i<=2;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		int[][]arr2= new int[3][3];
		
		for(int i =0; i<=2;i++) {
			for(int j=0;j<=2;j++) {
				arr2[i][j]=arr[j][2-i];
				}
			}System.out.println();
		for(int i =0;i<=2;i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
		
		int[][]arr3= new int[3][3];
		
		for(int i =0; i<=2;i++) {
			for(int j=0;j<=2;j++) {
				arr3[j][i]=arr[2-i][j];
			}
		}System.out.println();
		for(int i =0;i<=2;i++) {
			System.out.println(Arrays.toString(arr3[i]));
		}
		

	}

}
 