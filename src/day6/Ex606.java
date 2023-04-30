package day6;

public class Ex606 {

	public static void main(String[] args) {
//		누적합(1+2+3...) 과 누적곱(1*2*3*....)
//		1.누적합  : 2+3+4+5...=14
//		int sum = 0;
//		for (int i = 2; i<=5; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
//		2.누적곱 : 3*4*5*6 = 360
		int m = 1;
		for(int i = 3; i<=6; i++) {
			m *= i;
		}
		System.out.println(m);
	}

}
