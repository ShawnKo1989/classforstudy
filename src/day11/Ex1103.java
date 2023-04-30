package day11;

import java.util.Arrays;

public class Ex1103 {

	public static void main(String[] args) {
//		연습. 5개의 정수를 담을 수있는 배열을 만들고,
//		난수발생(1~10)해서 5개의 정수를 배열에 채우고,
//		1)반복문을 사용해서 모든 요소를 아래의 형식으로 출력:
//			--> "(3 9 8 4 5)"
		int[]arr= new int[5];
		for(int i=1;i<=5;i++) {
			arr[i-1]= (int)(Math.random()*10)+1;
		}
		System.out.print("(");
		for(int i=1;i<=5;i++) {
			System.out.print(arr[i-1]+(i<5?" ":""));
//			if(i<5) {
//				System.out.print(" ");
//			}
		}System.out.println(")");
//		2) [고급]이 배열에 이 ㅐㅂ열에서 홀수의 개수와 짝수의 개수를 출력:
//			-->배열이 [3, 9, 8, 4, 5] 였다면...
//			-->"홀수응 3개, 짝수는 2개"
		
		int odd =0; //홀수의갯수
		int even =0; //짝수의갯수
		
		for(int i=0;i<=4;i++) {
			if(arr[i]%2==0) {
				even++;
			}
			else odd++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("홀수는"+odd+"개 짝수는"+even+"개");
		System.out.println();
		
//		3) [최고급] 이 배열애 중복된 값이 있는지 여부를 판단:
//			배열이 [3, 9, 8, 4, 5]였다면...
//			--->"중복된 값 없음"
//			배열이 [3, 9, 3, 4, 5]였다면...
//			--->"중복된 값 있음"
		boolean b = false; // 중복된값이 있으면 true
		//초기값이 false라는 것은 중복된값이 없다는 의미
		String s ="";
		for(int i = 0; i<=3;i++) {
			for(int j=i+1;j<=4;j++) {
				if(arr[i]==arr[j]) {
					b=true;
					s+=arr[i];
				}
			}
		}
		if(b)System.out.print("중복된값이 있음. ("+s+")");
		else System.out.println("중복된값이 없음.");
		

	}

}
