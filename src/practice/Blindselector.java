package practice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Blind{
	String name;
	int num;
	Blind(String name, int num){
		this.name = name;
		this.num = num;
	}
}

public class Blindselector {
	static void showStat(ArrayList<Blind> arr,int rannum) {
		for(int i = 0; i<=arr.size()-1; i++) {
			String name = arr.get(i).name;
			int num = arr.get(i).num;
			System.out.println(name +"은(는) "+ (rannum==num+1? "당첨!": "꽝") + "입니다!");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Blind> arr = new ArrayList<Blind>();
		System.out.print("어떤 내기로 할거임? ");
		String item = sc.next();
		
		while(true) {
			System.out.println("종료 : 0");
			System.out.print("뽑을 숫자입력(참가자인원수 이하) : ");
			int num = sc.nextInt();
			if(num == 0) {
				break;
			}
			System.out.print("참가자 이름 : ");
			String name = sc.next();
			
			arr.add(new Blind(name,num));
		}
		Random rd = new Random();
		int rannum = rd.nextInt(arr.size())+1;
		
		showStat(arr,rannum);
		
		for(int i = 0; i<=arr.size()-1; i++) {
			if (arr.get(i).num+1 == rannum) {
				System.out.println(item +" 내기의 당첨자는 "+arr.get(i).name +"입니다.");
			}
		}
		
		

	}

}
