package day9;

public class Q905 {

	public static void main(String[] args) {
		//Q905. (고급) (실행결과) 1 -4 9 -16 25 -36 49 -64 81 -100
		for(int i =1; i<=10; i++) {
			if(i*i%4!=0)System.out.print(i*i +" ");
			if(i*i%4==0)System.out.print(i*i*-1+ " ");
		}
	}

}
