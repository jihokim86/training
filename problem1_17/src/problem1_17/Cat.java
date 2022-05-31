package problem1_17;

//--- 고양이 클래스 (ver.2) 
public class Cat extends Animal {
	
	private int age;
	
	public Cat(String name, int age) {
		super(name); // 자동생성되면 안보여도 되지 않나??
//		this.name = name; 로변변수 문제 발생
		this.age = age;
	}

//	public Cat() { //기본생성자
//	}
	
	public void bark() {
		System.out.println("냐옹!");
	}

	public int getAge() {
		return age;
	}

//	public void setAge(int age) {
//		this.age = age;
//	}

	@Override
	public String toString() {
		return age+"의"+getName();
	}
	
}
