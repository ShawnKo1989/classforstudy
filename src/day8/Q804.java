package day8;

import java.util.Scanner;

public class Q804 {

	public static void main(String[] args) {
//		7은 소수 
//		2,3,4,5,6 중에서 나누어 떨어지는 수가
//		없으므로 ------> 7은 소수다.
		Scanner sc = new Scanner(System.in);
		System.out.print("소수(prime number)인지 알고싶은 숫자를 입력 : ");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i=1; i<=num;i++) {
			if(num%i==0) {count++;}
		}
		
		if(count!=2) {
			System.out.print(num +"은(는) 소수가 아님.");
		}else {
			System.out.print(num + "은(는) 소수임.");
		}
		
	}

}
