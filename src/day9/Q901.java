package day9;

// 1부터 100까지의 정수중 일의 자리가 3,6,9,인수를 출력

public class Q901 {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(!(i%10==3||i%10==6||i%10==9)) {
				continue;
			}
			System.out.print(i + " ");
		}
		
	}

}
