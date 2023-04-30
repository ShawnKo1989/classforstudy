package day11;

import java.util.Arrays;
import java.util.Scanner;

public class Q1102 {

	public static void main(String[] args) {
//		Q1102. 연습(고급).
//		--------------------
//		1 2 3 4 5 6 7 8 9 10
//		. . . . . . . . . .           // . = 예약가능 / X = 예약불가능
//		--------------------
//		예약하시겠습니까? y (엔터)
//		예약할 좌석 번호 입력: 7 (엔터)
//		예약되었습니다.
//
//		--------------------
//		1 2 3 4 5 6 7 8 9 10
//		. . . . . . X . . .           // . = 예약가능 / X = 예약불가능
//		--------------------
//		예약하시겠습니까? y (엔터)
//		예약할 좌석 번호 입력: 7 (엔터)
//		이미 예약된 좌석입니다. 다시 입력해주세요.
//		예약할 좌석 번호 입력: 6 (엔터)
//		예약되었습니다.
//
//		--------------------
//		1 2 3 4 5 6 7 8 9 10
//		. . . . . X X . . .           // . = 예약가능 / X = 예약불가능
//		--------------------
//		예약하시겠습니까? n (엔터)
//		끝.
		String[]seat = new String[10]; // O 모양의 출력용 배열
		int[]booklist = new int[10]; 		//좌석예약 배열
		String line = "--------------------";
		int bookNum = 0;
		for(int i=0; i<=9;i++) {
			seat[i]="O ";
		}
		
		while(true) {
		System.out.println(line);
		for(int i=1; i<=10;i++) {
			System.out.print(i+" ");
		}System.out.println();
		for(String view:seat) {
			System.out.print(view);
		}
		System.out.println();
		System.out.println(line);
		
		Scanner sc =new Scanner(System.in);
		System.out.print("예약하시겠습니까? ");
		String yn =sc.next();
		char c = yn.charAt(0);
		if(c=='y') {
			while(true) {
				boolean check=false;
				System.out.print("예약할 좌석 번호 입력: ");
				int seatNum=sc.nextInt();
				seat[seatNum-1]="X ";
				booklist[bookNum] = seatNum;
				if(bookNum>0) {
					if(booklist[bookNum-1]==booklist[bookNum])check=true;
				}
				bookNum++;
				if(check) {
					bookNum--;
					System.out.println("이미 예약된좌석입니다.다시입력해주세요.");
				}else {
					System.out.println("예약되었습니다.");
					break;
				}
			}
		}
		if(c=='n') {
			System.out.println("끝.");
			break;
		}
		}
		
		
		
	}

}
