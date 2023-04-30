package day14;

import java.util.Arrays;

public class Q1402 {

	public static void main(String[] args) {
//			Q1402. 연습2(고급). 배열을 하나 만든 후,
//			arr1 : [1, 3, 2, 4, 5]
//			아래와 같은 실행결과가 되도록 코드를 채워보세요.
//			------------------------------------------
//			int[] arr1 = /* 여기에 코드를 작성 */ ;
//			int d = 2;   // 삭제할 요소의 인덱스번호
//			
//			/* 여기에 코드를 작성 */
//			
//			System.out.println("arr2 : " + Arrays.toString(arr2));
//			------------------------------------------
//			(실행결과)
//			arr2 : [1, 3, 4, 5]
		
			int[] arr1 = {1, 3, 2, 4, 5};
			int d = 2;   // 삭제할 요소의 인덱스번호
			int[] arr2 = new int[arr1.length-1];
			for(int i =0; i<=arr2.length-1; i++) {
				if(arr1[i]!=arr1[d]) {
					arr2[i]=arr1[i];
				}
				if(i>=d){
					arr2[i]=arr1[i+1];
				}
			}
			
			System.out.println("arr2 : " + Arrays.toString(arr2));
	}

}
