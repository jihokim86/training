package problem1_17;


public class AnimalTester1 {

	public static void main(String[] args) {
		
		Animal[] a= new Animal[2];
		a[0] = new Dog("��ġ", "ġ�Ϳ�"); 	// ��
		a[1] = new Cat("������",7);		// �����
		
//		Dog d = new Dog();
//		Cat c = new Cat();
//		
//		d.setName("��ġ");
//		d.setType("ġ�Ϳ�");
//		
//		c.setAge(7);
//		c.setName("������");
//		
//		System.out.println("�̸� ");
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
