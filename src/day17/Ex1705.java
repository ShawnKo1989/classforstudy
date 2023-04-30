package day17;

public class Ex1705 {
	static int plusInt(int a, int b) {
		return a+b;
	} // 메서드이름은 중복으로 사용할수 없다.
	static double plusDouble(double a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
		int sum = plusInt(3,5);
		System.out.println(sum);
		double sum2 = plusDouble(3.5,5.5);
		System.out.println(sum2);
		
		
		// 메서드 이름을 똑같이 쓸수있다.
//		단, 이름은 같으나 변수타입이 다를경우 중복해서 사용이 가능하다.
	}

}
