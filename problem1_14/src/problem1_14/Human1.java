package problem1_14;

public class Human1 {
	private String name;
	private int height;
	private int weight;
	private Day birthday;
	
	public Human1(String name, int height, int weight, Day birthday) {
		super();
		this.name = name; 		this.height = height;
		this.weight = weight;	this.birthday = birthday;
	}

	public String getName() {return name;}
	public int getHeight() {return height;}
	public int getWeight() {return weight;}
	public Day getBirthday() {return birthday;}
	
	public void gainWeight(int w)   {weight += w;}
	public void reduceWeight(int w) {weight -= w;}
	
	public void putData() {
		System.out.println("�̸�:" + name);
		System.out.println("����:" + height + "cm");
		System.out.println("ü��:" + weight + "kg");
	}
	public String toString() {
		return "{" + name + ": " + height + "cm  " + weight + "kg " + birthday + "���}";
	}

}
