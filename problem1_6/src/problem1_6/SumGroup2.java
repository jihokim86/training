package problem1_6;

import java.util.Scanner;

public class SumGroup2 {

	public static void main(String[] args) {
		// �������� �׷캰�� �о �ջ�(����5 x 10�׷�)
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ ���մϴ�.");
		int total = 0;
		
		Outer:
			for(int i=1;i<=10;i++) {
				System.out.println(i+"�׷�");
				
				for(int j=0 ;j<5;j++) {
					System.out.println("����:");
					int t = input.nextInt();
					if(t==99999){
						break Outer;
					}else if(t==88888) {
						continue Outer;
					}
					total += t;
				}
			}
		System.out.println("\n�հ�� "+ total + "�Դϴ�");
	}
}
