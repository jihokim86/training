package problem1_7;

public class DoubleArrayFor {

	public static void main(String[] args) {
		//��� ������ 5�� double�� �迭�� ����� �տ��� ����
		//1.1,2.2,3.3,4.4,5.5�� �����ؼ� ǥ���ϴ� ���α׷��� �ۼ�
		double[] a = new double[5];
		
		for(int i =0 ; i<a.length;i++) {
			a[i] = i*1.1+1.1;
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}
