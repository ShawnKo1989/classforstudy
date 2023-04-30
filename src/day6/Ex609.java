package day6;

public class Ex609 {

	public static void main(String[] args) {
//		(실행결과)	
//		2 * 1 = 2		3 * 1 = 3		4 * 1 = 4
//		2 * 2 = 4		3 * 2 = 6		4 * 2 = 8
//		2 * 3 = 6		3 * 3 = 9		4 * 3 = 12
//		...		...		...
//		2 * 9 = 18	3 * 9 = 27	4 * 9 = 36
//
//		5 * 1 = 5		6 * 1 = 6		7 * 1 = 7
//		...		...		...
//
//		8 * 1 = 8		9 * 1 = 9
//		...		...
		int mul = 1;
		for(int j = 1;j<=9;j++) {
			int i=2;
			while (true) {
				mul = i * j;
				System.out.print(i+" * "+j+" = "+mul +"\t");
				if (i%4 ==0) {
					break;
				}
				i++;
			}
			System.out.println();
		}
		System.out.println();
		for(int j = 1;j<=9;j++) {
			int i=5;
			while (true) {
				mul = i * j;
				System.out.print(i+" * "+j+" = "+mul +"\t");
				if (i%7 ==0) {
					break;
				}
				i++;
			}
			System.out.println();
		}
		System.out.println();
		for(int j = 1;j<=9;j++) {
			int i=8;
			while (true) {
				mul = i * j;
				System.out.print(i+" * "+j+" = "+mul +"\t");
				if (i%9 ==0) {
					break;
				}
				i++;
			}
			System.out.println();
		}
		

	}

}
