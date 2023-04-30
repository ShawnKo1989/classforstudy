package day9;

import java.util.Scanner;

public class Q908 {

	public static void main(String[] args) {
		//Q908. (고급3) 부루마블. 
		Scanner sc = new Scanner(System.in);
		int sum =0;
		String[]city={"서울","인천","대구","대전","목포","무인도","전주","강릉","울산","부산","제주도"};
		System.out.println("===[ 4X4 부루마블 게임 ]===\n");
		String hrs = "[■]";
		String brd = "[□]";
		System.out.print(hrs);
		for(int i =1; i<=3;i++) {
			System.out.print(brd);
		}
		System.out.println("\n"+brd+"\t"+" "+brd);
		System.out.println(brd+"\t"+" "+brd);
		for(int i= 1; i<=4;i++) {
			System.out.print(brd);
		}
		while(true){
		System.out.println();
		System.out.print("\n주사위를 던지려면 아무키나 입력후 엔터 : ");
		String start = sc.next();
		int num = (int)(Math.random()*6)+1;
		System.out.println("랜덤주사위의 숫자는 "+num+"이 나왔습니다.");
		System.out.println(num+"만큼 이동합니다.");
		sum += num;
		System.out.println();
		if(sum%6<=3&&sum%6!=0&&sum%7!=0&&sum%8!=0&&sum%9!=0) {
			for(int i=1; i<=(sum%6); i++) {
				System.out.print(brd);
			}System.out.print(hrs);
			for(int i=1;i<=4-((sum%6)+1);i++) {
				System.out.print(brd);
			}
			System.out.println("\n"+brd+"\t"+" "+brd);
			System.out.println(brd+"\t"+" "+brd);
			for(int i= 1; i<=4;i++) {
				System.out.print(brd);
			}
			for(int i =1; i<=3; i++) {
				if(sum%6==i)System.out.print("\n"+"\n"+city[i-1]+"에 도착하였습니다!");
			}
		}
		if(sum%6==4&&sum/10==0) {
			for(int i =1; i<=4;i++) {
				System.out.print(brd);
			}
			System.out.println("\n"+brd+"\t"+" "+hrs);
			System.out.println(brd+"\t"+" "+brd);
			for(int i= 1; i<=4;i++) {
				System.out.print(brd);
			}
			System.out.print("\n"+"\n"+city[4]+"에 도착하였습니다!");
		}
		if(sum%6==5&&sum/11==0) {
			for(int i =1; i<=4;i++) {
				System.out.print(brd);
			}
			System.out.println("\n"+brd+"\t"+" "+brd);
			System.out.println(brd+"\t"+" "+hrs);
			for(int i= 1; i<=4;i++) {
				System.out.print(brd);
			}
			System.out.print("\n"+"\n"+city[5]+"에 도착하였습니다!");
			System.out.print("무인도에 불시착하여 출발지로 돌아갑니다");
			sum=0;
			continue;
		}
		if(sum%6==0&&sum%12!=0) {
			for(int i =1; i<=4;i++) {
				System.out.print(brd);
			}
			System.out.println("\n"+brd+"\t"+" "+brd);
			System.out.println(brd+"\t"+" "+brd);
			for(int i= 1; i<=3;i++) {
				System.out.print(brd);
			}System.out.print(hrs);
			System.out.print("\n"+"\n"+city[6]+"에 도착하였습니다!");
		}
		if(sum%7==0) {
			for(int i =1; i<=4;i++) {
				System.out.print(brd);
			}
			System.out.println("\n"+brd+"\t"+" "+brd);
			System.out.println(brd+"\t"+" "+brd);
			for(int i= 1; i<=2;i++) {
				System.out.print(brd);
			}System.out.print(hrs+brd);
			System.out.print("\n"+"\n"+city[7]+"에 도착하였습니다!");
		}
		if(sum%8==0) {
			for(int i =1; i<=4;i++) {
				System.out.print(brd);
			}
			System.out.println("\n"+brd+"\t"+" "+brd);
			System.out.println(brd+"\t"+" "+brd);
			System.out.print(brd+hrs);
			for(int i= 1; i<=2;i++) {
				System.out.print(brd);
			}
			System.out.print("\n"+"\n"+city[8]+"에 도착하였습니다!");
		}
		if(sum%9==0) {
			for(int i =1; i<=4;i++) {
				System.out.print(brd);
			}
			System.out.println("\n"+brd+"\t"+" "+brd);
			System.out.println(brd+"\t"+" "+brd);
			System.out.print(hrs);
			for(int i= 1; i<=3;i++) {
				System.out.print(brd);
			}
			System.out.print("\n"+"\n"+city[9]+"에 도착하였습니다!");
		}
		if(sum%10==0) {
			for(int i =1; i<=4;i++) {
				System.out.print(brd);
			}
			System.out.println("\n"+brd+"\t"+" "+brd);
			System.out.println(hrs+"\t"+" "+brd);
			for(int i= 1; i<=4;i++) {
				System.out.print(brd);
			}
			System.out.print("\n"+"\n"+city[10]+"에 도착하였습니다!");
		}
		if(sum%11==0) {
			for(int i =1; i<=4;i++) {
				System.out.print(brd);
			}
			System.out.println("\n"+hrs+"\t"+" "+brd);
			System.out.println(brd+"\t"+" "+brd);
			for(int i= 1; i<=4;i++) {
				System.out.print(brd);
			}
			System.out.print("\n"+"\n"+city[11]+"에 도착하였습니다!");
		}
		
		if(sum/12>=1) {
			System.out.print("\n축하합니다.출발점을 통과했습니다!");
			sum-=12;
		}
	}
		
		
	}

}
