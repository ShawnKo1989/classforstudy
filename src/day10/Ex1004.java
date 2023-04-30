package day10;

public class Ex1004 {

	public static void main(String[] args) {
		//배열(암기가 필요)
		//배열의 크기 : 방의 개수를 뜻함.
		//방번호 : 인덱스라고 부른다. 또는 인덱스번호
		//인덱스는 항상 0부터 시작한다
		//[정리]
		//배열의생성
		//배열(배열객체)을 가리킬 변수를 선언
		//	ex) int[] arr;  // 타입[] 변수이름 <--요렇게 선언
		//배열(배열객체)을 생성해서 위 변수와 연결
		//	ex) arr = new int[3]; // 크기 3인 배열
		//
		//
		//
		//
		int[] arr = {70,85,90}; // arr[0] = 70이라는 의미.
		int total = 0;
		double avg= 0.0;
		for(int i=1; i<=2;i++) {
			total +=arr[i];
		}
		System.out.println("총점 :"+total);
		avg= total/3.0;
		System.out.print("평균 :"+avg);
	}

}
