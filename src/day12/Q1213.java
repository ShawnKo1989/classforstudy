package day12;

import java.util.Arrays;
import java.util.Scanner;

public class Q1213 {

	public static void main(String[] args) {

//			Q1213. (고급) 정수 하나를 입력 받아서, 각 자릿수별로 ‘짝수인지’ 여부를 판단하여
//			boolean 타입의 배열을 채워서 아래와 같이 출력해보세요. 예를 들어, 697은 6이 짝수이고,
//			9와 7은 짝수가 아니므로 [true, false, false] 를 출력합니다.
//			(실행결과)
//			정수 입력 : 1443
//			[false, true, true, false]
//			
//			(실행결과)
//			정수 입력 : 1499207
//			[false, true, false, false, true, true, false]
//			
//			(실행결과)
//			정수 입력 : 697
//			[true, false, false]
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		int a =num;
		int count = 0;
		while(true) {				//몇자리수인지 산출한다.
			a/=10;
			count++;
			if((a/10)==0) {
				count++;
				break;
			}
		}
		boolean[]b=new boolean[count];  // 자릿수에 맞는 boolean배열 출력.
		
		for(int i=0; i<=count-1; i++) {	//각 자릿수가 짝수인지 판별
			int num2 = 1;
			for(int j=i+1;j<=count-1;j++) {
				num2*=10;
			}
			if((num/num2)%2==0) {
				b[i]=true;
			}
		}
		
		System.out.println(Arrays.toString(b));
	}

}
