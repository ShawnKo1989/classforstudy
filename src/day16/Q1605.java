package day16;

public class Q1605 {
	static int max4(int[]a) {
		int max = a[0];
		for(int i = 0; i<=a.length-1; i++) {
			for(int j=i+1; j<=a.length-1; j++) {
				if(a[i]>a[j]) max = a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {

//		Q1605) max4 메서드를 정의.
//			- 파라미터 : 정수형 배열.
//			- 리턴 : 배열의 요소들 중 최대 값을 리턴.
//			main():
//			- 난수발생(1~9) 4개의 정수 ---> 정수형 배열(size:4)에 채워주세요.
//			- sysout( max4(arr) );
		int[]arr = new int[4];
		for(int i =0; i<=arr.length-1; i++) {
			arr[i] = (int)(Math.random()*9)+1;
		}
		System.out.println(max4(arr));
		
	}
}
