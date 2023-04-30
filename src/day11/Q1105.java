package day11;

public class Q1105 {

	public static void main(String[] args) {
//		Q1106.	연습(최고급).
//		크기가 5인 정수형 배열을 난수 발생(1~9)해서 채우고,
//		1) 배열 전체의 내용을 출력.
//		2) "버블정렬 알고리즘"을 적용해서, 오름차순 정렬 후 출력.
		int a =0;
		int[]arr=new int[5];
		for(int i=1;i<=4;i++) {
			arr[i]=(int)(Math.random()*9)+1;
		}
		System.out.print("일반적인 출력은 : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
		for(int i=0;i<=4;i++) {
			for(int j=i+1;j<=4;j++) {
				if(arr[i]>arr[j]) {
					a=arr[j];
					arr[j]=arr[i];
					arr[i]=a;
				}
			}
		}
		System.out.print("버블 알고리즘(오름차순)의 출력은 :");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}

}
