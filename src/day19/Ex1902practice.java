package day19;

import java.util.ArrayList;
import java.util.Scanner;

class Memberss {
	String name;
	String sex;
	double height;
	double weight;
	int age;
	
	Memberss(String name, String sex, double height, double weight, int age){
		this.name = name;
		this.sex = sex;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
}
//남자 : 66.47 + (13.75 × 체중) + (5×키) - (6.76 × 나이)
//여자 : 655.1 + (9.56 × 체중) + (1.85 × 키) - (4.68 × 나이)

public class Ex1902practice {
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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Memberss> list3 =new ArrayList<Memberss>();
		
		System.out.print("이름을 입력하세요 : ");
		String inputName = sc.next();
		System.out.print("성별을 입력하세요 : ");
		String inputSex = sc.next();
		System.out.print("키를 입력하세요 : ");
		double inputHei = sc.nextDouble();
		System.out.print("몸무게를 입력하세요 : ");
		double inputWei = sc.nextDouble();
		System.out.print("나이를 입력하세요 : ");
		int inputAge = sc.nextInt();
		
		list3.add(new Memberss(inputName,inputSex, inputHei,inputWei,inputAge));
		
//		for(int i =0; i<=list3.size()-1; i++) {
//			System.out.println(list3.get(i).name + " " + list3.get(i).height+ " "+
//							list3.get(i).weight+ " " + list3.get(i).age);
//		}
		if(inputSex.equals("남자")){
			double mens = mensMeta(inputWei,inputHei,inputAge);
			System.out.println(inputName +"님의 기초대사량은 "+ (double)mens +"kcal 입니다.");
		}
		if(inputSex.equals("여자")){
			double womens = womsMeta(inputWei,inputHei,inputAge);
			System.out.println(inputName + "님의 기초대사량은 "+ (double)womens +"kcal 입니다.");
		}
		System.out.println("BMI지수는 : " + bmiCal(inputWei,inputHei));
		System.out.print("현재 상태는 ");
		bmiLevel(bmiCal(inputWei,inputHei));
		System.out.println("입니다.");
		
	}

}
