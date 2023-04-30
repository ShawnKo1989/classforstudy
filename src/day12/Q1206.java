package day12;

import java.util.Random;

public class Q1206 {
	public static void main(String[] args) {
//		Q1206. (고급) 크기가 100,000인 배열을 생성하고 int의 표현범위 내의 값을
//		100,000개 난수 발생하여 이 배열을 채운 후 이 배열의 홀수와 짝수의 개수를 파악하여,
		
//		①홀수가 몇 개이고 이게 전체 중 몇 퍼센트에 해당하는지
		
//		②짝수는 몇 개이고 이게 전체중 몇 퍼센트에 해당하는지를 출력해보세요.
		
		
		int[]arr=new int[100000];
		int count1 =0;
		for(int i =0; i<=99999;i++) {
			arr[i]=(int)(Math.random()*2100000000);
			if(arr[i]%2==0) {
				count1++;
			}
		}
		System.out.println("홀수의 갯수는 "+(arr.length-count1)+"입니다.");
		System.out.println("홀수는 전체중 "+(double)(((arr.length-count1)/(double)arr.length)*100)+"퍼센트입니다.");
		System.out.println("짝수의 갯수는 "+count1+"입니다.");
		System.out.println("짝수는 전체중 "+(double)((count1/(double)arr.length)*100)+"퍼센트입니다.");
		
		//풀었음!!
	}
}
