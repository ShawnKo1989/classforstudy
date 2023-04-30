package hongongja;

public class StudentExample {
	public static void main(String args[]) {
		Student student = new Student("고승우","123425-234235",1);
		
		System.out.println("name : "+ student.name);
		System.out.println("ssn : "+ student.ssn);
		
		System.out.println("studentNo : "+ student.studentNo);
	}
}
