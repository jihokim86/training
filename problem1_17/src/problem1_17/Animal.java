package problem1_17;

//---����Ŭ����(ver2)---//
abstract class Animal {
	
	private String name;			//�̸�

	public Animal(String name) {	//������
		this.name = name;			//set���� �ޱ����� ��
	}
	
//	public Animal() {
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}

	public String getName() {		//�̸�Ȯ��
		return name;
	}
	
	public abstract void bark();	//¢��
	
	public abstract String toString(); //���ڿ� ǥ�� ��ȯ
	
	public void introduce() {
		System.out.print(toString()+"�̴�.");
		bark();
	}
}


