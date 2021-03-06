package problem1_13;

import java.util.Scanner;

public class CarTest2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("차량데이터를 입력하세요");
		System.out.print("이름 : "); String name = input.next();
		System.out.print("번호 : "); String number = input.next();
		System.out.print("전폭 : "); int width = input.nextInt();
		System.out.print("전고 : "); int height = input.nextInt();
		System.out.print("전장 : "); int length = input.nextInt();
		System.out.print("탱크용량 : "); double tankage = input.nextDouble();
		System.out.print("연료량 : "); double fuel=input.nextDouble();
		System.out.print("연비 : "); double sfc = input.nextDouble();
		
		Car myCar = new Car(name, number, width, height, length, tankage, fuel, sfc);
		
		while(true) {
			System.out.printf("현재 위치 : (%.2f, %.2f)\n",myCar.getX(),myCar.getY());
			System.out.printf("남은 연료 : %.2f\n",myCar.getFuel());
			System.out.println("이동하겠습니까?[0_NO/1_YES]");
			if(input.nextInt()==0) {
				break;
			}
			System.out.println("x방향으로의 이동 거리 : ");
			double dx = input.nextDouble();
			
			System.out.println("y방향으로의 이동 거리 : ");
			double dy = input.nextDouble();
			
			if(!myCar.move(dx, dy)) {
				System.out.println("연로부족!!");
			}
		}
		input.close();		
	}

}
