package day8;

public class Q802 {

	public static void main(String[] args) {
//		1~100까지의 정수중 3의 배수만 출력하되 무한반복문을 사용하여..
//		int i = 0;
//		while (true) {
//			if (i >100) break;
//			System.out.print(i+ " ");
//			i+=3;
//		}
		
		//for를 사용하여 풀이#2
		int i = 0;
		for(;;) {
			i++;
			if(i>100) break;
			if(i%3!=0) {
				continue;
			}
			System.out.print(i+ " ");
		}
		
	}

}
