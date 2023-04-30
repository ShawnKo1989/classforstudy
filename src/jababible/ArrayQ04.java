package jababible;

import java.util.Scanner;

public class ArrayQ04 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.print("거슬러 받을 돈을 입력하세요 : ");
			int money = sc.nextInt();
			System.out.println("money="+money);
			int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
			int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
			
			for(int i=0;i<=coinUnit.length-1;i++) {
				int coinNum = 0;
				while(coinNum<coin[i]) {
					money -= coinUnit[i];
					coinNum++;
				}
				coin[i] = coin[i]-coinNum;
				if(coin[i]<0) {
					coinNum = coin[i];
					coin[i]=0;
				}
				//금액 을 동전단위로 나눠서 필요한 동전의 개수 를 구한다
				//배열 에서 필요한 만큼의 동전을 뺀다
				//만일 충분한 동전이 없다면 배열 에 있는 만큼만 뺀다
				 //금액에서 동전의 개수 와 동전단위를 곱한 값을 뺀다 
				
				System.out.println(coinUnit[i]+" : "+coinNum); //원
			}
			if(money > 0) {
				System.out.println("거스름돈이 부족합니다.");		//거스름돈이 부족합니다
				System.exit(0); 							// . 프로그램을 종료한다
			}
			System.out.println("= 남은 동전의 갯수 ="); 			//남은 동전의 개수
			for(int i=0;i<=coinUnit.length-1;i++) {
				System.out.println(coinUnit[i]+" :"+coin[i]); 
			}
	}

}
