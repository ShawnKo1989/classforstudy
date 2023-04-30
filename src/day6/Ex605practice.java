package day6;

public class Ex605practice {

	public static void main(String[] args) {
		//1부터 100까지의 정수들 중에서 짝수만 출력
		for(int i =1; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i +" ");
			}
		}
		System.out.println();
		//1부터 100까지의 정수들 중에서 2의배수 3의배수 7의 배수
		for(int i=1;i<=100;i++) {
			if(i%2==0 ||i%3==0||i%7==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		//1부터 100까지의 정수들 중에서 일의자리가 6일 수를 구해라
		for(int i =1; i <=100;i++) {
			if(i%10==6) {
				System.out.print(i +" ");
			}
		}
		System.out.println();
		//1부터 100까지의 정수중에서 십의자리와 일의자리가 같은 수를 구하시오.
		for(int i = 1; i <=100;i++) {
			if((i/10%10)==(i%10)) {
					System.out.print(i +" ");
			}
			
		}
	}

}
