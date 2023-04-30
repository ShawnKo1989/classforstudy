package day9;

import java.util.Scanner;

public class Ex903 {

	public static void main(String[] args) {
//		(실행결과) 홀수만 입력 : 3 (엔터)
//				 홀수만 입력 : 7 (입력)
//				 홀수만 입력  : 1(엔터)
//				 홀수만입력 : 12(엔터)
//				 짝수가 입력되었음! 끝!
//				 (실행결과)지금까지 입력한 모든 홀수의 합 = 11
//				 (실행결과)지금까지 입력한 모든 홀수의 합 : 3+ 7 +1 = 11
//				 --> 단, ArrayList 등의 사용금지 -->  배열을 사용.
//				 (실행결과) 홀수만 입력 : 3(엔터)
//				 		   홀수만 입력 : 7(엔터)
//				 		   홀수만 입력  :3(엔터)
//				 		  3은이미 입력하셨습니다. 다른 값을 입력해주세요.
//				 		   홀수만 입력: 4(엔터)
//				 		   지금까지 입력한 모든 홀수의 합: 3+7 = 10
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = -1;
		int[] intArray = new int[99];
		System.out.print("홀수만 입력 : ");
		int input = sc.nextInt();
		if(input%2==1)sum += input;
		count++;
		intArray[count] = input;
		while(input%2==1) {
			System.out.print("홀수만 입력 : ");
			input = sc.nextInt();
			if (input%2==0)break;
			for(int i=0;i<=count+1;i++) {
			if (input==intArray[i]) System.out.println(input+"은 이미 입력하셨습니다. 다른값을 입력해주세요.");
			}
			sum += input;
			count++;
			intArray[count] = input;
		}
		if(input%2==0) {
			System.out.println("짝수가 입력되었음! 끝!");
		}
		System.out.println("지금까지 입력한 모든 홀수의 합 : "+ sum);
		System.out.print("지금까지 입력한 모든 홀수의 합 : ");
		for(int i =0; i <=count; i++) {
			System.out.print(intArray[i]);
			if(i<count)System.out.print("+");
			if(i==count)System.out.print(" = ");
		}
		System.out.println(sum);
	}

}
