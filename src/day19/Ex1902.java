package day19;

import java.util.ArrayList;

class Member {
	String id;
	String name;
	int pw;
	Member(String id, String name, int pw){
		this.id = id;
		this.name= name;
		this.pw = pw;
	}
}
public class Ex1902 {
	public static void main(String[] args) {

//		객체를 다루는 배열
//		- Member 클래스 (--> 회원) :  아아디 , 이름, 비밀번호
//									1) String id
//									2) String name
//									3) int pw
//		- 사이즈 3인 "Member 형 배열"
		int[] arr  = new int [3];
		// 인트값을 3개 담을수 있는 배열이 필요.
		// int 변수를 3개 선언하는 것과 같은 효과.
		
		// Member 참조변수를 3갸 선언하는 것과 같은 효과...
		Member[]arr2 = new Member[3];
		arr2[0]  = new Member("KSW","고승우",1234); 
		arr2[1]  = new Member("LJP","이재필",1234); 
		arr2[2]  = new Member("KJH","김지환",1234); 
		
		for(int i =0; i<=2; i++) {
			System.out.println(arr2[i].id+ " "+arr2[i].name+ " "+arr2[i].pw+ " ");
		}
		// ArrayList  --> "가변길이  배열" 이라고 생각하세요.
		// 1. 정수 ----> (int 말고) "Integer"라는 표현을 사용.
		// 2. 객체생성 ) ArrayList <Integer> list1 = new ArrayList<Interger>(); // <>제너릭이라 부른다.
		// '정수 저장 가변길이 배열'
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		System.out.println(list1);
		list1.add(10);
		System.out.println(list1);
		list1.add(20);
		System.out.println(list1);
		list1.add(30);
		System.out.println(list1);
		list1.add(40);
		System.out.println(list1);
		// 1) .add(값)
		// 2) 출력 --> sysout(참조변수)
		// 3) .contain(값) 		//6) .size() -> 크기 (배열이름 .length와 같음)
		if(list1.contains(30)) {	// 30이 배열 안에 있는지 여부
			System.out.println("30이 있음!!");
		}
		for(int i=0; i<=list1.size()-1; i++) {
			if(list1.get(i)==30) {
				System.out.println("30이 있음.");
				break;
			}
		}
		// 4) .remove (인덱스)
		list1.remove(1); // 20 이 삭제가 됨.
		System.out.println(list1);
		
		
		// 5) .get(인덱스) ------> "배열이름[인덱스]"와 같음.
		for(int i = 0; i<=2;  i++) {
			System.out.print(list1.get(i) + " ");
		}System.out.println();
		
		
		// 7) .set(인덱스, 새로운 값)
		list1.set(2, 50);
		System.out.println(list1);
		
		for(int i=0; i<=list1.size()-1;i++) {
			list1.set(i, list1.get(i)+1);
		}System.out.println(list1);
		
		ArrayList<Member> list2 = new ArrayList<Member>();
		list2.add(new Member("KSW","고승우",1234)); 
		list2.add(new Member("LJP","이재필",1234)); 
		list2.add(new Member("KJH","김지환",1234)); 
		
		// 배열의 길이 --> arr.length
		// 문자열의 길이 --> str.length()
		// ArrayList(list1) 의 길이 --> list1.size()
 		// 전체회원조회
		for(int i= 0; i<= list2.size()-1; i++) {
			// "이름 _  아이디 _ 비밀번호" 형식으로 출력
			String name = list2.get(i).name;
			String id = list2.get(i).id;
			int pw = list2.get(i).pw;
			System.out.println(name+"_"+id+"_"+pw);
		}
		// 2. 회원등록 ---> .add(new Member(~~))
		
		// 3. 회원검색.
		String str = "Hello";
		System.out.println(str.indexOf("ell"));
		System.out.println(str.indexOf("llo"));
		System.out.println(str.indexOf("oll"));
		System.out.println(str.contains("oll"));
		
		String findName = "P";
		for(int i =0; i<=list2.size()-1; i++) {
			if(list2.get(i).id.indexOf(findName)>-1) {
				System.out.println("빙고!!");
				Member m = list2.get(i);
				System.out.println(m.name + "_"+ m.id+ "_"+m.pw);
			}
		}
		// 4. 회원삭제.(ID값)
		String idDelete = "KSW";
		// 인덱스 ---> list2.remove(인덱스)
		for(int i =0; i<=list2.size()-1;i++) {
			if(list2.get(i).id.equals(idDelete)) {
				list2.remove(i);
				break;
			}
			
		}
		System.out.println("<삭제후>");
		for(int i =0; i<= list2.size()-1; i++) {
			Member m = list2.get(i);
			System.out.println(m.name + "_"+m.id+ "_"+ m.pw);
		}
		
	}

}
