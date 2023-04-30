package day6;

public class Ex609practice {
	public static void main(String[] args) {
		
		int mul = 1;
		int a = 2;
		while(a<=8) {
		for(int j = 1;j<=9;j++) {
			for (int i=a;(i<=a+2)&&(i>=2&&i<=9);i++) {
				mul = i * j;
				System.out.print(i+" X "+j+" = "+mul +"\t");
			}
			System.out.println();
		}
		System.out.println();
		a+=3;
		}
	}

}
