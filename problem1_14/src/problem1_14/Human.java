package problem1_14;

public class Human {
	//�ʵ�
	private String name;
	private int height;
	private int weight;
	private Day birthday;
	
	
	//������
	Human(String name, int height, int weight){
		this.name = name;
		this.height=height;
		this.weight=weight;
		this.birthday = new Day(birthday);
	}
	
	//�޼ҵ�
	String getName() {
		return name;
	}
	public Day getBirthday() {
		return  new Day(birthday);
	}

	int getHeight() {
		return height;
	}
	int getWeight() {
		return weight;
	}
	
	void gainWeight(int weight) {
		this.weight += weight;
	}
	
	void reduceWeight(int weight) {
		this.weight -= weight;
	}
	
	public void putData() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + height +"cm");
		System.out.println("�̸� : " + weight+"kg");
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", height=" + height + ", "
				+ "weight=" + weight + ", birthday=" + birthday + "]";
	}
	
	
	
}
