package day8;

public class Ex803 {
	public static void main(String[] args) {
		//소수 (prime number) 1과 자기 자신만을 약수로 가지는 자연수
//		-->ex)7은 1과 자기 자신으로만 나눠어 떨어지기 때문에
//		소수이다.
		int num=7; //prime number인지 아닌지 테스트할 숫자.
		int count =0;
		for (int i =1;i<=num;i++) {
			if(num%i==0)
				count +=1;
		}
//		System.out.println(count); // 카운트값은 1,7 이렇게 두개만 count에 나오게 된다.
		if (count ==2) {
			System.out.print(num + " (은)는 소수임.");
		}else {
			System.out.print(num + " (은)는 소수가 아님.");
		}
	}

}
