package problem1_7;

public class IntArrayFor {

	public static void main(String[] args) {
		//��� ������ 5���� int�� �迭�� ������� 5,4,3,2,1�� �����ϴ� 
		//���α׷��� �ۼ�
		
		int[] a= new int[5];
		for(int i=0; i<a.length; i++) {
			a[i] = 5-i;
			System.out.println("a["+i+"]="+a[i]);
	}
  }
}
