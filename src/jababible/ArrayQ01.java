package jababible;

public class ArrayQ01 {

	public static void main(String[] args) {
		int[]ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[]ball3 = new int[3];
		
		//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i = 0; i<=ballArr.length-1;i++) {
			int j = (int)(Math.random()*ballArr.length);
			int tmp =0;
				
			tmp = ballArr[j];
			ballArr[j] = ballArr[i];
			ballArr[i] = tmp;
						
		}
		//배열 ballArr 의 앞에서 3개의 수를 배열 ball3로 복사한다.
		for(int i=0; i<=ball3.length-1;i++) {
			ball3[i] = ballArr[i];
		}
		
		for(int i=0;i<=ball3.length-1;i++) {
			System.out.print(ball3[i]);
		}
	}

}
