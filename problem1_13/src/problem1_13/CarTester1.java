package problem1_13;

public class CarTester1 {

	public static void main(String[] args) {
		//Car Ŭ������ �̿��ϴ� ���α׷��� �ۼ�
		Car k3 = new Car("k3", "����999-99", 1660, 1500, 3640, 40.0, 35.0,12.0);
		Car k5 = new Car("k5", "����999-98", 1660, 1525, 3695, 41.0, 35.0,12.0);
		
		k3.putSpec();
		System.out.println();
		k5.putSpec();
		
	}

}
