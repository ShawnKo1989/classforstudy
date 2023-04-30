package day8;

 //break continue

public class Ex801 {

	public static void main(String[] args) {
//			1,2,3,4,...
		for(int i = 1 ; i<=7;i++) {
			if (i==5)
				break;
			System.out.print(i + " ");
		}
		System.out.println();
	
	// 1,2,3,5,6,7,...
	for(int i = 1; i <=7; i++) {
		if (i==4)
			continue;
		System.out.print(i + " ");
	}
	System.out.println();
	
	// while 울 사용한 1~7 문
	int i = 1;
	while(i<=7) {
		if(i==4)
			break;
		System.out.print(i + " ");
		i++;
	}
	System.out.println();
	// while 울 사용한 1~7 문 continue일때.적용법
	i = 1;
	while(i<=7) {
		if(i==4) {
			i++;
			continue;
		}
		System.out.print(i + " ");
		i++;
	}
	System.out.println();
	
	
}

}
