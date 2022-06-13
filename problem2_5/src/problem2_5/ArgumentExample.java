package problem2_5;

class AgTest {
	AgTest(){}
	int count;	
	int argument(int ... value){
		int sum=0;
		
		for(int i =0; i<value.length; i++) {
			
			System.out.print(value[i]);
			System.out.print(" ");
			count++;
			sum = sum+value[i];
		}
		System.out.println();
		return sum;
	}
	@Override
	public String toString() {
		return "�Ű����� ������ " + count + " �� �Դϴ�.";
	}
}

public class ArgumentExample {

	public static void main(String[] args) {
		//�Ű������� ������ Ȯ���ϰ� ������ ���
		
		AgTest a = new AgTest();
		AgTest b = new AgTest();
		AgTest c = new AgTest();
		
		System.out.print("�Ű������� : ");
		a.argument(1,5);
		System.out.println(a.toString());
		
		System.out.println("--------------------");
		System.out.print("�Ű������� :");
		b.argument(1,5,4,8,9);
		System.out.println(b.toString());
		
		System.out.println("--------------------");
		System.out.print("�Ű������� :");
		c.argument(1,5,1,6,4,8,9,10,31,45);
		System.out.println(c.toString());
	}

}
