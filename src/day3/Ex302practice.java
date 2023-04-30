package day3;

public class Ex302practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 3;
		short s=b; // 자동 형변환 byte -> short
		int i= s;// 자동 형변환 short -> int
		long lo = i; // 자동형변환 int -> long
		float f = lo; // 자동형변환 long -> float
		double d = f; // 자동형변환 float -> double
		System.out.println(d);

		char ch = 'A';
		System.out.println(ch);
		
		char ch2 = 65;
		System.out.println(ch2);
		int i2 = ch;
		System.out.println(i2);
		
		String s3 = "ABC";
		String s4 = "";
		
		byte b2 = 65;
		System.out.println(d);
		int num = (int)d;
		int num2 = (int)d *3;
		int num3 = (int)(d*3);
		
		
		
		
	}

}
