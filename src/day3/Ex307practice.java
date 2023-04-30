package day3;
import java.util.Scanner;
public class Ex307practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = 127;
		byte b2 = (byte)0b1000_0000;
		byte b3 = 0x7f;
		byte b4 = 0177;
		System.out.println(b1+"," +b2+"," + b3+","+ b4);
		
		b4++;
		System.out.println(b4);
		
//		입력값을 받았을때, 10진수와 16진수로 표현되는 조건식
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 숫자를 넣으세요 : ");
		int a = sc.nextInt();
		while (true) {
		if (a >= -21_0000_0000 && a <= 21_0000_0000) {
			int b = a%2; 
			a = a /2;
			System.out.print(b);
		}if (a == 0){
			break;
		}
		
		}
		
		
		
	}

}
