package problem2_6;

public class MultipleExample {

	public static void main(String[] args) {
		//1~20���̿��� 2�Ǵ� 3�� ��� ���
		for(int i=0; i<=20 ;i++) {
			if(i%2==0 || i%3==0) {
				System.out.println(i);
			}
		}
	}
}
