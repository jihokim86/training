package problem2_4;

public class PrintSeason {

	public static void main(String[] args) {
		Season[] season;
		season = Season.values();
		
		System.out.println(Season.values()); //[Lproblem2_4.Season;@4926097b
		System.out.println(season); 		 //[Lproblem2_4.Season;@762efe5d
											 //�� �ٸ���?
		for(Season s : season) {				//���� for�� 
			System.out.println(s);
		}
	}

}
