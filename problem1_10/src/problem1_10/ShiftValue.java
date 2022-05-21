package problem1_10;

import java.util.Scanner;

public class ShiftValue {
	static int pow2(int no) {
		int pw=1;
		while(no-- >0) {
			pw *=2;
		}
		return pw;
	}

	public static void main(String[] args) {
		//������ �¿�� ����Ʈ �� ���� '����x2�� �ŵ�����' ��
		//'����/2�� �ŵ� ����'�� ������ Ȯ���ض�
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� x�� n��Ʈ ����Ʈ�մϴ�");
		System.out.print("x:"); int x = stdIn.nextInt();
		System.out.print("n:"); int n = stdIn.nextInt();
		
		int mPower = x*pow2(n);
		int dPower = x/pow2(n);
		int lShift = x <<n;
		int rShift = x >>n;
		
		System.out.printf("[a] X x(2�� %d��)=%d\n",n,mPower);
		System.out.printf("[b] X /(2�� %d��)=%d\n",n,dPower);
		System.out.printf("[c] X << %d = %d\n",n,lShift);
		System.out.printf("[d] X << %d = %d\n",n,rShift);
		
		System.out.println("[a]��[c]�� ���� ��ġ"+((mPower == lShift)?"�մϴ�.":"���� �ʽ��ϴ�."));
		System.out.println("[b]��[d]�� ���� ��ġ"+((dPower == rShift)?"�մϴ�.":"���� �ʽ��ϴ�."));
		
	}

}
