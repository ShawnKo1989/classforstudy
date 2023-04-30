package practice;

import java.util.ArrayList;
import java.util.Scanner;
class MenuManager{
	Scanner sc;
	MenuManager(Scanner sc){
		this.sc = sc;
	}
	int selectMenu() {
		System.out.println("------------------");
		System.out.println("1. 전체성적조회");
		System.out.println("2. 성적등록");
		System.out.println("3. 성적검색");
		System.out.println("4. 성적삭제");
		System.out.println("0. 종료");
		System.out.println("------------------");
		System.out.print("메뉴선택> ");
		int input = sc.nextInt();
		return input;
	}
}
class ScoreData{
	String name;
	int jav;
	int eng;
	int kor;
	int math;
	ScoreData(String name, int jav ,int eng, int kor, int math){
		this.name = name;
		this.jav = jav;
		this.eng = eng;
		this.kor = kor;
		this.math = math;
	}
}
class ScoreManager{
	Scanner sc;
	ArrayList<ScoreData> listScores;
	ScoreManager(Scanner sc, ArrayList<ScoreData> listScores){
		this.sc = sc;
		this.listScores = listScores;
	}
	void showAllScores() {
		System.out.println("<전체성적조회>");
		for(int i = 0 ; i<=listScores.size()-1; i++) {
			String name = listScores.get(i).name;
			int jav = listScores.get(i).jav;
			int eng = listScores.get(i).eng;
			int kor = listScores.get(i).kor;
			int math = listScores.get(i).math;
			System.out.println(i+1+"번 - \t" + "[이름:"+name+"]");
			System.out.println("\t"+ "자바:" +jav+"점, 국어:"+kor+"점, 영어:"+eng+"점, 수학:"+math);
		}
		if(listScores.size()==0) {
			System.out.println(" - 저장된 성적데이터가 없습니다 -");
		}
	}
	void addScore() {
		System.out.println("<성적등록>");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("자바 : ");
		int jav = sc.nextInt();
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		ScoreData sd = new ScoreData(name, jav, kor, eng, math);
		listScores.add(sd);
		System.out.println("등록되었습니다!");
	}
	void searchScore() {
		boolean a = false;
		System.out.println("<성적검색>");
		System.out.print("검색할 이름을 입력하세요: ");
		String name = sc.next();
		for(int i = 0; i<=listScores.size()-1; i++) {
			if(listScores.get(i).name.contains(name)) {
				a = true;
				System.out.println(listScores.get(i).name+"을(를) 찾았습니다!");
				int jav = listScores.get(i).jav;
				int eng = listScores.get(i).eng;
				int kor = listScores.get(i).kor;
				int math = listScores.get(i).math;
				System.out.println(i+1+"번 - \t" + "[이름:"+listScores.get(i).name+"]");
				System.out.println("\t"+ "자바:" +jav+"점, 국어:"+kor+"점, 영어:"+eng+"점, 수학:"+math);
			}
		}
		if(!a) {
			System.out.println(" - 그런 이름이 없습니다. - ");
		}
	}
	void deleteScore() {
		System.out.println("<성적삭제>");
		System.out.print("(삭제할 성적데이터의 번호를 입력하세요: )");
		int input = sc.nextInt();
		if(input-1 <0 || input-1>listScores.size()-1){
			System.out.println("유효하지 않은 번호입니다.");
			return;
		}
		listScores.remove(input-1);
		System.out.println("삭제되었습니다.");
	}
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<ScoreData> listScores = new ArrayList<ScoreData>();
		
//		listScores.add(new ScoreData("YG",100,2,3,4));
//		listScores.add(new ScoreData("G",90,2,7,4));
//		listScores.add(new ScoreData("YG2",80,2,3,5));
		
		MenuManager mm = new MenuManager(sc);
		ScoreManager sm = new ScoreManager(sc, listScores);
		while (true) {
			int menu = mm.selectMenu();
			switch(menu) {
			case 1:
				sm.showAllScores();
				break;
			case 2:
				sm.addScore();
				break;
			case 3:
				sm.searchScore();
				break;
			case 4:
				sm.deleteScore();
				break;
			case 0:
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
			if(menu==0) {
				break;
			}
		}

	}

}
