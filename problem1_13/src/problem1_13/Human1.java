package problem1_13;

public class Human1 {
	//필드
	private String name;
	private int height;
	private int weight;
	
	//생성자
	Human1(String name, int height, int weight){
		this.name = name;
		this.height=height;
		this.weight=weight;
	}
	
	//메소드
	String getName() {
		return name;
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
}
