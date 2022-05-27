package problem1_14;

public class Human2 {
	private static int counter =0;
	private String name;
	private int height;
	private int weight;
	private int id;
	
	public Human2(String name, int height, int weight) {
		super();
		this.name = name; 		this.height = height;
		this.weight = weight;	
		id=++counter;
	}

	public String getName() {return name;}
	public int getHeight() {return height;}
	public int getWeight() {return weight;}
	
	public void gainWeight(int w)   {weight += w;}
	public void reduceWeight(int w) {weight -= w;}
	
	public int getIn() {
		return id;
	}
	
	public void putData() {
		System.out.println("�̸�:" + name);
		System.out.println("����:" + height + "cm");
		System.out.println("ü��:" + weight + "kg");
	}
	
}
