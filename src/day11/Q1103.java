package day11;

public class Q1103 {

	public static void main(String[] args) {
//		Q1103. 연습. 난수 발생(1~10) 값을 크기가 6인 배열을 채운 후,
//		1) 배열의 내용을 출력. (단, Arrays.toString() 사용X)
//		2) 평균 값을 출력
//		   ---> "평균 : _____"
//		3) 평균 값보다 큰 요소들만 출력. 
//		   ---> "평균보다 큰 요소 : ________..."
		int[]arr=new int[6];
		int sum = 0;
		for(int i=0;i<=5;i++) {
			arr[i]=(int)(Math.random()*10)+1;
		}
		for(int i=0;i<=5;i++) {
			System.out.print(arr[i]+" ");
			sum+=arr[i];
		}System.out.println();
		System.out.println("배열의 총합은 : "+sum);
		System.out.println("평균 : "+sum/6f);
		System.out.print("평균값보다 큰요소는 : ");
		for(int i=0;i<=5;i++) {
			if(arr[i]>sum/6)System.out.print(arr[i]+" ");
		}
		

	}

}
