package test1;

public class GradeStudent {

	public static void main(String[] args) {
		 //��ޱ��ϱ�
		
		int score = 70;
		char grade;
		
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A'; break;
		case 8:
			grade = 'B'; break;
		case 7:
			grade = 'C'; break;
		case 6:
			grade = 'D'; break;
		default:
			grade = 'F'; 
		}
		System.out.println("�л��� ������ " + grade + "�����Դϴ�.");
	
	}//end of main
}//end of class


		