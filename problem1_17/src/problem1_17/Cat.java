package problem1_17;

//--- ����� Ŭ���� (ver.2) 
public class Cat extends Animal {
	
	private int age;
	
	public Cat(String name, int age) {
		super(name); // �ڵ������Ǹ� �Ⱥ����� ���� �ʳ�??
//		this.name = name; �κ����� ���� �߻�
		this.age = age;
	}

//	public Cat() { //�⺻������
//	}
	
	public void bark() {
		System.out.println("�Ŀ�!");
	}

	public int getAge() {
		return age;
	}

//	public void setAge(int age) {
//		this.age = age;
//	}

	@Override
	public String toString() {
		return age+"��"+getName();
	}
	
}
