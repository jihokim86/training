package problem1_17;

import java.util.Scanner;

public class ShapeTester {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ ����:");
		int no = input.nextInt();
		Shape[] p = new Shape[no]; //�ܺ� Ŭ������ Shape Ŭ������ �����ϱ� ���� ��ü ����
		
		for(int i =0 ; i <no;i++) {
			int type;
			do {
				System.out.print((i+1)+"�� ������ ����(1...��"
						+ "/2..����"+"/3..������"+"/4..�簢��): ");
				type = input.nextInt();
			}while(type < 1 || type > 4);
			
			switch (type) {
			case 1: p[i] = new Point(); break; 	// ��
			case 2: 							//����
			case 3: System.out.print("���̴�:");
					int len = input.nextInt();
					p[i]=(type==2)? new HorzLine(len) : new VertLine(len);
					break;
			case 4: System.out.print("�ʺ�:");
					int width = input.nextInt();
					System.out.print("����:");
					int height = input.nextInt();
					p[i]= new Rectangle(width,height); //shapeŬ������ ���� ����
					break;
					//�θ�Ŭ������ ShapeŬ������ ��ӹް� �ִ� Rectangle Ŭ������.
					// Shape p = new Rectangle() <- �θ�Ŭ������ ���� p�� ��ü Rectangle�� �����Ѵ�.
					// Rectangle Ŭ������ �ʵ尪�� �ʱ�ȭ �ϰ� break;
					//���� ��� for������ �̵�
					
			}
		}
		//for�� �Ϸ��� �Ʒ� ����
		// p�迭�� ������� Shape Ÿ���� ����s�� ����
		//	public void print(){
		//	System.out.println(toString()); -> ���ڸ� ���� ���
		//	draw(); }	-> draw �Լ� ȣ��
	
		for(Shape s : p) { // Ÿ���� Shape�� �ؾ��ϴ°�??? p�� Ÿ�԰� ��������ϴµ��ѵ�~ ���������� �ʹ��� ����.
			s.print();		// Shape s = p = new Rectangle  �θ�Ŭ������ �����ϱ� ���� s.print
			System.out.println();
			
//			Rectangle ��ü�� �����Ͽ��� ������  
//			System.out.println(toString()); 
//			toString() �Լ��� Rectangle���� ȣ��
//			@Override
//			public String toString() {
//				return "Rectangle(width=" + width + ", height=" + height + ")";
//			}
//			���� draw()�� Ractangle()���� ȣ�����
//			�߿��Ѱ���
//			Shape s = new Rectangle �϶��� ��Ȳ�̴�. �̺κ��� �����ؾ��Ѵ�.
		}
	}

}
