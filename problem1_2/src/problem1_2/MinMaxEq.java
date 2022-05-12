package problem1_2;
import java.util.Scanner;

public class MinMaxEq {

	public static void main(String[] args) {
// 입력받은 2개의 정수 값중 작은 값과 큰 값을 표시. 같으면 같다고 표시
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력하세요.");
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a>b) {
			System.out.println("입력값 중 큰 값은"+a+"이고, 작은 값은 "+b+" 입니다.");
		}else if(b>a) {
			System.out.println("입력값 중 큰 값은"+b+"이고, 작은 값은 "+a+" 입니다.");
		}else {
			System.out.println("입력한 두 값은 같습니다.");
		}
		input.close();
	}

}
