package problem1_17;


public class AnimalTester1 {

	public static void main(String[] args) {
		
		Animal[] a= new Animal[2];
		a[0] = new Dog("뭉치", "치와와"); 	// 개
		a[1] = new Cat("마이콜",7);		// 고양이
		
//		Dog d = new Dog();
//		Cat c = new Cat();
//		
//		d.setName("뭉치");
//		d.setType("치와와");
//		
//		c.setAge(7);
//		c.setName("마이콜");
//		
//		System.out.println("이름 ");
//		System.out.printf("%s  ||  %s\n",d.getName(),d.getType());
//		System.out.printf("%s  ||  %s\n",c.getName(),c.getAge());
		
		
		for (int  i= 0;  i< a.length; i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
		
		for (int  i= 0;  i< a.length; i++) {
			System.out.print("a["+i+"]=");
			a[i].introduce();
		}
	}

}
