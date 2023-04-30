package day15;

public class Q1501practice {
	static void a(int a,int b) {
		for(int i=1; i<=a; i++) {
			System.out.print("*");
		}System.out.println();
		for(int i=1; i<=b; i++) {
			System.out.print("*");
		}System.out.println();
	}
	static void printStars(int a, char b) {
		for(int i =1; i<=a;i++) {
			System.out.print(b);
		}System.out.println();
	}
	public static void main(String[] args) {
			//	연습1(Q1501). 
//			- main() 메서드 :
//			printStars(4, '*');  // ****
//			printStars(6, '*');  // ******) 
		
			a(4,6);
			
			printStars(4,'*');
			printStars(6,'*');
	}

}
