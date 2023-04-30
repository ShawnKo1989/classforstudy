package day9;

public class Ex904 {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i%7==0)continue;
			if(i%13!=0)continue;
			System.out.print(i+ " ");
		}
	}

}
