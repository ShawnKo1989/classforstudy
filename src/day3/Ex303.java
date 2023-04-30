package day3;

public class Ex303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		실수의 사용은 오차를 동반할수 있음.
//		실수 (real number)는 컴퓨터 상에서 근사값으로 표현되는시스템.
		//0.1 을 100번 더하면?
		float f = 0.0f; // 0.0 뒤에 f를 붙이는 이유?
		for ( int i=1; i<= 100; i++) {
			f +=0.1f;
		}
		System.out.println(f);
		
		double d =0.0;
		for (int i =1; i <=100;i++) {
			d += 0.1;
		}
		System.out.println(d);
		
//		float --> single precision정확도
//		double -> double precision
		
		System.out.println(0.1 + 0.2);
		
	}

}
