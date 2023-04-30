package day8;

import java.util.Scanner;

public class Ex802 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위 바위 보를 입력하세요 : ");
		String player = sc.next();
		// 여기에 제대로 입력되지 않았으면 제대로 입력 할때까지 반복해서 입력.
//		while((!player.equals("가위"))&&(!player.equals("바위"))&&(!player.equals("보"))) {
//			System.out.print("잘못입력하였습니다. 가위 바위 보를 입력하세요 : ");
//			player = sc.next();
//		}
		// 여기에 제대로 입력되지 않았으면 제대로 입력 할때까지 반복해서 입력.(2)
		while(true) {
			if((player.equals("가위"))||(player.equals("바위"))||(player.equals("보"))) {
				break;
			}
			System.out.print("잘못입력하였습니다. 가위 바위 보를 입력하세요 : ");
			player = sc.next();
		}
		
		
		String com = new String[] { "가위", "바위" ,"보"} [(int)(Math.random()*3)]; //배열(Array) 중요 따로 필기가 필요!

		System.out.println("플 : "+player+ "  "+"컴 :  "+com);
		
		//문자열 비교를 하게된다 [문자열.equals(문자열2)]
		if(player.equals("가위")&& com.equals("보")
			||player.equals("바위")&& com.equals("가위")
			||player.equals("보")&& com.equals("바위")	
				){
			System.out.print( "Player win!!");
		}else if(com.equals("가위")&& player.equals("보")
				||com.equals("바위")&& player.equals("가위")
				||com.equals("보")&& player.equals("바위")) {
			System.out.println("Player lose!!");
		}else {
			System.out.println("Draw up!!");
		}
		
		
	}

}
