package day11;

import java.util.Arrays;

public class Ex1102 {

	public static void main(String[] args) {
//		연습.크기가 10인 정수형 배열을 만들고,
//		여기에 10,20,30,40,50,60,70,80,90,100을 넣고
//		1) 반복문을 사용해서 이배열의 내용을 출력
//			(실행결과) 10 20 30 40 50 60 70 80 90 100
//			(고급화)[10,20,30,40...]
		
		int[]arr= new int[10];
		int sum =0;
		for(int i =0; i<=9;i++) {
			arr[i]=(i+1)*10;
		}
		for(int i=0;i<=9;i++) {
			System.out.print(arr[i]+" ");
			sum+=arr[i];
		}System.out.println();
		System.out.println(Arrays.toString(arr));
		
//		2) 이 배열의 모든 요소의 총합을 출력
//			(실행결과) 550
//			(고급화)10+20+30+40+50+..+100 = 550
		
		System.out.println(sum);
		for(int i=0;i<=9;i++) {
			System.out.print(arr[i]);
			if(i<9)System.out.print("+");
		}System.out.println(" = "+sum);
		
//		3) 요소들 중 십의 자리가 짝수인 요소들만 출력
//			(실행결과)20 40 60 80 100
		
		for(int i=0;i<=9;i++) {
			if((arr[i]/10%10)%2==0) {
				System.out.print(arr[i]+" ");
			}
//		4) 이 배열애서 십의 자리가 짝수인 요소들의 부호를 (-)호
//			만든 후 Arrays.toString() 사용하여 출력.
//			(실행결과)[10,-20,30,-40.....-100]
		
		}System.out.println();
		for(int i =0; i<=9;i++) {
			if((arr[i]/10%10)%2==0) {
				arr[i] = -arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
