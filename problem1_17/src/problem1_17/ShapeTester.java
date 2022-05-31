package problem1_17;

import java.util.Scanner;

public class ShapeTester {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("도형의 개수:");
		int no = input.nextInt();
		Shape[] p = new Shape[no]; //외부 클래스인 Shape 클래스에 접근하기 위해 객체 생성
		
		for(int i =0 ; i <no;i++) {
			int type;
			do {
				System.out.print((i+1)+"번 도형의 종류(1...점"
						+ "/2..수평선"+"/3..수직선"+"/4..사각형): ");
				type = input.nextInt();
			}while(type < 1 || type > 4);
			
			switch (type) {
			case 1: p[i] = new Point(); break; 	// 점
			case 2: 							//직선
			case 3: System.out.print("길이는:");
					int len = input.nextInt();
					p[i]=(type==2)? new HorzLine(len) : new VertLine(len);
					break;
			case 4: System.out.print("너비:");
					int width = input.nextInt();
					System.out.print("높이:");
					int height = input.nextInt();
					p[i]= new Rectangle(width,height); //shape클래스에 접근 가능
					break;
					//부모클래스인 Shape클래스를 상속받고 있는 Rectangle 클래스임.
					// Shape p = new Rectangle() <- 부모클래스의 변수 p는 객체 Rectangle를 참조한다.
					// Rectangle 클래스의 필드값을 초기화 하고 break;
					//이후 상단 for문으로 이동
					
			}
		}
		//for문 완료후 아래 실행
		// p배열을 순서대로 Shape 타입의 변수s에 저장
		//	public void print(){
		//	System.out.println(toString()); -> 문자를 먼저 출력
		//	draw(); }	-> draw 함수 호출
	
		for(Shape s : p) { // 타입을 Shape로 해야하는가??? p의 타입과 맞춰줘야하는듯한데~ 직감적으로 와닿지 않음.
			s.print();		// Shape s = p = new Rectangle  부모클래스에 접근하기 위해 s.print
			System.out.println();
			
//			Rectangle 객체를 저장하였기 때문에  
//			System.out.println(toString()); 
//			toString() 함수는 Rectangle에서 호출
//			@Override
//			public String toString() {
//				return "Rectangle(width=" + width + ", height=" + height + ")";
//			}
//			이후 draw()도 Ractangle()에서 호출당함
//			중요한것은
//			Shape s = new Rectangle 일때의 상황이다. 이부분을 이해해야한다.
		}
	}

}
