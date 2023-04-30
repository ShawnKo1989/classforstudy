package day8;

public class Q801 {

	public static void main(String[] args) {
//		1~100 까지를 출력하되 무한반복문을 사용해서
		int i = 1;
		while(true) {
			if(i > 100) break;
			System.out.print(i + " ");
			i++;
		}
	}

}
