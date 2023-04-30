package day19;

import java.util.ArrayList;
import java.util.Scanner;

class Bmi{
	double hei;
	double wei;
	Bmi(double hei, double wei){
		this.hei = hei;
		this.wei = wei;
	}
}
class Members{
	String name;
	int age;
	String sex;
	String rel;
	int pw;
	Bmi bmi;

	Members(String name, int age, String sex, String rel, int pw, Bmi bmi){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.rel = rel;
		this.pw = pw;
		this.bmi = bmi;
	}
}

public class Ex1903 {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Members> list1 = new ArrayList<Members>();
	static void example() {
		System.out.println("-----[회원관리 시스템]-----");
		System.out.println("1. 전체회원조회\r\n" + 
				"2. 회원등록\r\n" + 
				"3. 회원검색(BMI/기초대사량)\r\n" + 
				"4. 회원삭제\r\n" + 
				"5. 회원정보수정\r\n" +
				"0. 종료");
		System.out.println("----------------------");
	}
	static double mensMeta(double wei, double hei, int age) {
		double metaBol = 66.47+ (13.75*wei) + (5*hei) - (6.76*age); 
		metaBol = (int)(metaBol*100)/100;
		return metaBol;
	}
	static double womsMeta(double wei, double hei, int age) {
		double metaBol = 655.1 + (9.56*wei) + (1.85*hei) - (4.68*age);
		metaBol = (int)(metaBol*100)/100;
		return metaBol;
	}
	static double bmiCal(double wei, double hei) {
		double bmi = wei / (hei*hei) *10000;
		bmi = ((int)(bmi*100))/100;
		return bmi;
	}
	static void bmiLevel(double b) {
		if(b>=35)System.out.print("3단계 고도비만");
		else if(b>30&&b<34.9)System.out.print("2단계 비만");
		else if(b>25&&b<29.9)System.out.print("1단계 비만");
		else if(b>23&&b<24.9)System.out.print("비만전단계");
		else if(b>18.5&&b<22.9)System.out.print("정상수치");
		else System.out.print("저체중");
			
	}
	static void showAll() {
		System.out.println("\n전체 회원을 조회합니다."); // 이름 / 나이 / 성별 / 사는지역
		if(list1.size()==0) System.out.println("(등록된 회원이 없습니다)");
		else {
				for(int i =0; i<=list1.size()-1; i++) {
					String name = list1.get(i).name;
					int age = list1.get(i).age;
					String sex = list1.get(i).sex;
					String rel = list1.get(i).rel;
					double wei = list1.get(i).bmi.wei;
					double hei = list1.get(i).bmi.hei;
					if(list1.get(i).bmi ==null) {
						System.out.println(name + " / " + age + "세 / " + sex + " / " + rel);
					}else {
						System.out.println(name + " / " + age + "세 / " + sex + " / " + rel + " / " 
						+ wei + "kg / " + hei+"cm");
					}
					
				}
		}
	}
	static int pw(int pw) {
		System.out.print("비밀번호 확인을 위해 한번 더 눌러주세요 :");
		while(true) {
			int pwcheck = sc.nextInt();
			if(pw == pwcheck) {
				return pwcheck;
			}else {
				System.out.print("비밀번호가 일치하지 않습니다! 다시입력하세요 :");
			}
		}
	}
	static void Input() {
		System.out.println("\n회원을 등록합니다.");
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("성별을 입력하세요 : ");
		String sex = sc.next();
		System.out.print("지역을 입력하세요 : ");
		String rel = sc.next();
		System.out.print("비밀번호를 설정해주세요 : ");
		int pw = sc.nextInt();
		int pwb = pw(pw);
		System.out.print("BMI / 기초대사량을 저장하시겠습니까? y/n");
		String choice = sc.next();
		if(choice.equals("y")) {
			System.out.print("키를 입력하세요 : ");
			double hei = sc.nextDouble();
			System.out.print("몸무게를 입력하세요 : ");
			double wei = sc.nextDouble();
			Bmi bmi = new Bmi(hei,wei);
			list1.add(new Members(name, age, sex, rel, pwb, bmi));
		}else {
			list1.add(new Members(name, age, sex, rel, pwb, null));
		}
	}
	static void searching () {
		System.out.println("\n회원을 검색합니다.");
		System.out.print("검색하실 회원의 이름을 입력하세요 : ");
		String Sname = sc.next();
		for(int i=0; i<=list1.size()-1; i++) {
			System.out.print("개인정보 보호를 위해 비밀번호를 입력해주세요 :");
			int pw = sc.nextInt();
			if(list1.get(i).name.equals(Sname)) {
				if(list1.get(i).pw==pw) {
					System.out.println("비밀번호가 일치합니다!");
					break;
				}else {
					System.out.println("잘못된 비밀번호 입니다. 다시입력하세요.");
					pw(list1.get(i).pw);
				}
			}
		}
		
		for(int i=0; i<=list1.size()-1; i++) {
			if(list1.get(i).name.indexOf(Sname)>-1) {
				if(list1.get(i).bmi==null) {
					Members m = list1.get(i);
					System.out.println(m.name + " / "+ m.age + " / "+ m.sex+ " / "+ m.rel);
				}else {
					Members m = list1.get(i);
					System.out.println(m.name + " / "+ m.age + "세 / "+ m.sex+ " / "+ m.rel + " / " + m.bmi.hei+"cm / "+m.bmi.wei + "kg");
					if(list1.get(i).sex.equals("남자")){
						double mens = mensMeta(list1.get(i).bmi.wei,list1.get(i).bmi.hei,list1.get(i).age);
						System.out.println(list1.get(i).name +"님의 기초대사량은 "+ (double)mens +"kcal 입니다.");
					}
					if(list1.get(i).sex.equals("여자")){
						double womens = womsMeta(list1.get(i).bmi.wei,list1.get(i).bmi.hei,list1.get(i).age);
						System.out.println(list1.get(i).name + "님의 기초대사량은 "+ (double)womens +"kcal 입니다.");
					}
					System.out.println("BMI지수는 : " + bmiCal(list1.get(i).bmi.wei,list1.get(i).bmi.hei));
					System.out.print("현재 상태는 ");
					bmiLevel(bmiCal(list1.get(i).bmi.wei,list1.get(i).bmi.hei));
					System.out.println("입니다.\n");
				}
			}
		}
				
	}
	static void delete() {
		System.out.println("선택한 회원을 삭제합니다.");
		System.out.print("삭제할 회원의 이름을 입력하세요 : ");
		String Dname = sc.next();
		for(int i=0; i<=list1.size()-1; i++) {
			if(list1.get(i).name.equals(Dname)) {
				list1.remove(i);
			}
		}
		System.out.println(Dname + "님이 삭제되었습니다.");
	}
	static void selectNumofpro() {
		System.out.println("---------\r\n" + 
				"1. 이름 \r\n" + 
				"2. 나이 \r\n" + 
				"3. 성별\r\n" + 
				"4. 지역 \r\n" + 
				"5. 키\r\n" + 
				"6. 몸무게\r\n" + 
				"7. 종료\r\n" + 
				"---------");
	}
	static void replace() {
		System.out.print("수정할 회원이름을 입력 : ");
		String rename = sc.next();
		for(int i =0; i<=list1.size()-1; i++) {
			if(list1.get(i).name.indexOf(rename)!=-1) {
				selectNumofpro();
				System.out.print(">> ");
				int num = sc.nextInt();
				switch (num){
				case 1:
					System.out.print("새로 등록할 이름을 입력 : ");
					String nameFix = sc.next();
					list1.get(i).name = nameFix;
					break;
				case 2:
					System.out.print("새로 등록할 나이를 입력 : ");
					int ageFix = sc.nextInt();
					list1.get(i).age = ageFix;
					break;
				case 3:
					System.out.print("새로 등록할 성별을 입력 : ");
					String sexFix = sc.next();
					list1.get(i).sex = sexFix;
					break;
				case 4:
					System.out.print("새로 등록할 지역을 입력 : ");
					String relFix = sc.next();
					list1.get(i).rel = relFix;
					break;
				case 5:
					System.out.print("새로 등록할 키를 입력 : ");
					double heiFix = sc.nextDouble();
					if(list1.get(i).bmi == null) {
						list1.get(i).bmi = new Bmi(heiFix,0);
					}else {
						System.out.println(heiFix > list1.get(i).bmi.hei? "키가 크셨군요!! 축하합니다!": "");
						list1.get(i).bmi.hei = heiFix;
					}
					break;
				case 6:
					System.out.print("새로 등록할 몸무게를 입력 : ");
					double weiFix = sc.nextDouble();
					if(list1.get(i).bmi== null) {
						list1.get(i).bmi = new Bmi(0, weiFix);
					}else {
						System.out.println(weiFix > list1.get(i).bmi.wei? "몸무게가 느셨군요 ㅠ_ㅠ": "축하합니다!! 다이어트 성공!");
						list1.get(i).bmi.wei = weiFix;
					}
					break;
				case 7:
					System.out.println("수정을 마칩니다.");
					break;
				}
				
			}
		}
	}
	public static void main(String[] args) {
		
		while(true) {
			example();
			System.out.print("\n>> ");	//주어진 번호에서 선택
			int select = sc.nextInt();
			
			switch(select) {		// 번호를 선택했을때 작동하는 메커니즘.
				case 0:
					System.out.println("\n종료합니다.");	
					break;
				case 1:
					showAll();	//	1. 전체회원조회
					continue;
				case 2:
					Input();	//	2. 회원등록
					continue;
				case 3:
					searching();	//	3. 회원검색
					continue;
				case 4:
					delete();	//	4. 회원삭제
					continue;
				case 5:
					replace();		//5. 회원정보수정
					continue;
			}
			
		
		}
	}

}


//Today. Java (19) / 내부평가대비
//---------------------------------------------
//1. 참조값
//2. "this" : "객체 자기 자신(의 참조값)"
//--------------------------------------------
//내부평가대비.
//Ex1902.
//(실행결과)
//	-------------------
//	1. 전체회원조회
//	2. 회원등록
//	3. 회원검색
//	4. 회원삭제
//	0. 종료
//	-------------------
//	>> 1 (엔터)
//	(등록된 회원이 없습니다)
//
//	-------------------
//	1. 전체회원조회
//	2. 회원등록
//	3. 회원검색
//	4. 회원삭제
//	0. 종료
//	-------------------
//	>>

//---------
//1. 이름 
//2. 나이 
//3. 성별
//4. 지역 
//5. 키
//6. 몸무게
//---------



