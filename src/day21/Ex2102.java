package day21;

import java.util.Arrays;

class A{
	static int a;
	int b;
}
public class Ex2102 {

	public static void main(String[] args) {
		int c;
		c=0;
		A obj = new A();
		System.out.println(A.a);
		System.out.println(obj.b);
		System.out.println(c);
		
		int[]arr = new int[3];
		System.out.println(Arrays.toString(arr));
	}

}
