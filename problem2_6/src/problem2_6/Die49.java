package problem2_6;

public class Die49 {

	public static void main(String[] args) {
		//�ֻ��� �� ���� ���� ������ �հ� ���� ������ó�� �������.
		//��� �޼ҵ�� static�޼ҵ��� ���� �������� �����Ѵ�.
		
		//�ܺ� Ŭ������ �����ϱ� ���ؼ��� ��ü�� �����ؾ��Ѵ�.
		Die die = new Die(); //��ü����
		die.addDie();
		die.multiDie();
		
		
		//static Ŭ������ ��ü���� ���� Class. ���� Ŭ������ ���ٰ����ϴ�
		Die.addDiestatic();
		Die.multiDiestatic();
	}

}

class Die{
	public void addDie() {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				System.out.println(i+"+"+j+"="+(i+j));
			}
		}
		System.out.println("==============");
	}
	
	public void multiDie() {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
	
	public static void addDiestatic() {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				System.out.println(i+"+"+j+"="+(i+j));
			}
		}
		System.out.println("==============");
	}
	
	public static void multiDiestatic() {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
}
