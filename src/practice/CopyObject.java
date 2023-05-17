package practice;

public class CopyObject {

	private String name;
	private int age;
	
	public CopyObject(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
class CopyObjectTest{
	void shallowCopy() {
		CopyObject original = new CopyObject("SW",37);
		CopyObject copy = original;
		
		copy.setName("Seungwoo");
		
		System.out.println(original.getName());
		System.out.println(copy.getName());
	}
}
