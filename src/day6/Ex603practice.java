package day6;

public class Ex603practice {

	public static void main(String[] args) {
		// 12345
		for (int i=1; i<=5;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		int i = 1;
		while(i<=5) {
			System.out.print(i +" ");
			i++;
		}
		System.out.println();
		i=1;
		do {
			System.out.print(i + " ");
			i++;
		} while(i<=5);
		System.out.println();
		// 6 5 4 3 2 
		i=1;
		for(i =6;i>1;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		i=6;
		while (i>1) {
			System.out.print(i +" ");
			i--;
		}
		System.out.println();
		i=6;
		do {
			System.out.print(i+" ");
			i--;
		} while(i>1);
		System.out.println();
		// 0 2 4 6 8
		for(i=0;i<=8;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		i = 0;
		while(i<=8) {
			System.out.print(i +" ");
			i+=2;
		}
		System.out.println();
		i=0;
		do {
			System.out.print(i +" ");
			i+=2;
		}while(i<=8);
		System.out.println();
		// 1 4 9 16 25 36
		for(i=1; i<=6; i++) {
			System.out.print(i*i +" ");
		}
		
	}

}
