package day11;

import java.util.Arrays;

public class Q1101 {

	public static void main(String[] args) {
//		크기가 4인 int형 배열을 만들고, 이 배열을 1~10 사이의 난수로 채우고,
//		이 배열이 오름차순/내림차순 여부를 판단. (난수발생 -> 중복 값 없도록)
//		(실행결과) [4, 3, 7, 9]
//			 -> 오름차순X 내림차순X
//		(실행결과) [1, 2, 7, 8]
//			 -> 오름차순O
//		(실행결과) [8, 6, 4, 1]
//		 	 -> 내림차순O
		int[]arr = new int[4];
		int count =0;
		while(true) {						//중복되지않는 난수발생
			boolean repeat= false;
			for(int i=0;i<=3;i++) {
				arr[i]=(int)(Math.random()*10)+1;
			}
			for(int i=0;i<=3;i++) {
				for(int j=i+1;j<=3;j++) {
					 if(arr[i]==arr[j]) repeat=true;
				}
			}
			if(repeat)continue;
			else break;
		}
		
		
		for(int i=0;i<=3;i++) {				//카운터를 사용한 오름,내림차순
			for(int j=i+1;j<=3;j++) {
				if(arr[i]<arr[j])count++;
				else if(arr[i]>arr[j])count--;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.print("->");
		if(count==6) {
			System.out.println("오름차순 O");
		}
		else if(count==-6){
			System.out.println("내림차순 O");
		}else if(count!=3&&count!=-3){
			System.out.println("오름차순 X 내림차순 X");
		}
	}

}
