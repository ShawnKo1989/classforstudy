package day14;

public class Ex1401 {
	public static void main(String[] args) {
		int[]arr = {3,4,-1,2,5};
		for(int i =0;i<=arr.length-1;i++) {
			System.out.print((arr[i]> 0? arr[i]:-arr[i])+" ");
		}System.out.println();
		for(int n:arr) {  // for-each 문은 배열안의 내용을 들여다볼때 사용!
			if(n<0) {
				n = -n;
			}
			System.out.print(n+ " ");
		}
		// 2차원 배열 
//		- 대괄호 [] 가 2개./인덱스(번호)가 2개
//		-arr[1][0] : 1은 "행" 번호 0은 "열"번호. -->순서 : 항상, "행" "열"
//		- 행 : (아래방향 인덱스) = "row"
//		- 열 : (오른쪽방향) = "column(col)"
//		
//		- 2차원 배열을 가리킬 변수를 선언 
//		ex) int[][]arr;
//		--> int형 2차원 배열을 가리 킰 있는 변수
//			arr 을 선언
//		- 배열(객체)을 생성해서 위변수와 연결
//		ex) arr = new int[2][3];
//		--> 행 2와 열 3인 배열을 생성해서 arr과 연결
		
		
	}

}
