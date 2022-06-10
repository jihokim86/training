package problem2_4;

public class PrintSeason {

	public static void main(String[] args) {
		Season[] season;
		season = Season.values();
		
		System.out.println(Season.values()); //[Lproblem2_4.Season;@4926097b
		System.out.println(season); 		 //[Lproblem2_4.Season;@762efe5d
											 //왜 다를까?
		for(Season s : season) {				//향상된 for문 
			System.out.println(s);
		}
	}

}
