package problem1_17;

//--- �� Ŭ���� (ver.2) 

class Dog extends Animal{
	
	private String type;
	
	public Dog(String name,String type) {
		super(name);
		this.type = type;
	}
	
//	public Dog() { //�⺻������
//	}
//	
	public void bark() {
		System.out.println("�۸�");
	}
	

	public String getType() {
		return type;
	}

//	public void setType(String type) {
//		this.type = type;
//	}

	@Override
	public String toString() {
		return type+"��"+getName();
	}
	
}
