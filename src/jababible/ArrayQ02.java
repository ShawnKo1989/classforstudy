package jababible;

public class ArrayQ02 {

	public static void main(String[] args) {
		int[][]arr = {
				{5 ,5 ,5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
//		System.out.print(arr.length);
//		System.out.print(arr[0].length);
		
		int total = 0;
		float average = 0;
		
		for(int i =0; i<=arr.length-1; i++) {
			for(int j = 0; j<=arr[i].length-1; j++) {
				total += arr[j];
			}
		}
		
		
		System.out.println("Total = "+ total);
		System.out.println("Average = "+ average);
	}

}
