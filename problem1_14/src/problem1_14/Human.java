package problem1_14;

public class Human {
	//필드
	private String name;
	private int height;
	private int weight;
	private Day birthday;
	
	
	//생성자
	Human(String name, int height, int weight){
		this.name = name;
		this.height=height;
		this.weight=weight;
		this.birthday = new Day(birthday);
	}
	
	//메소드
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
		System.out.println("이름 : " + name);
		System.out.println("신장 : " + height +"cm");
		System.out.println("이름 : " + weight+"kg");
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", height=" + height + ", "
				+ "weight=" + weight + ", birthday=" + birthday + "]";
	}
	
	
	
}
