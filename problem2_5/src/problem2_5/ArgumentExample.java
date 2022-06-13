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
		return "매개변수 개수는 " + count + " 개 입니다.";
	}
}

public class ArgumentExample {

	public static void main(String[] args) {
		//매개변수의 개수를 확인하고 내용을 출력
		
		AgTest a = new AgTest();
		AgTest b = new AgTest();
		AgTest c = new AgTest();
		
		System.out.print("매개변수는 : ");
		a.argument(1,5);
		System.out.println(a.toString());
		
		System.out.println("--------------------");
		System.out.print("매개변수는 :");
		b.argument(1,5,4,8,9);
		System.out.println(b.toString());
		
		System.out.println("--------------------");
		System.out.print("매개변수는 :");
		c.argument(1,5,1,6,4,8,9,10,31,45);
		System.out.println(c.toString());
	}

}
