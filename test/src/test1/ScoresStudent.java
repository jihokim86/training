package test1;

public class ScoresStudent {

	public static void main(String[] args) {
		//점수 98,70,45,60,83
		//1. 총점 2.평균 3.최고점수 4.최저점수
		
		 int[] scores = {98,70,45,60,83};
		 int sum=0;
		 int max=0;
		 int min=100; // min =scores[0] 0의 배열값을 넣어줌.
		 
		 for(int i=0;i<scores.length;i++) {
			 sum += scores[i];
			 if(scores[i]>max) {
				 max= scores[i];
			 }
			 if(scores[i]<min) {
				 min = scores[i];
			 }
		 }
		 double avg = (double)sum/scores.length;
		 
		System.out.println("총점은 :"+ sum);
		System.out.println("평균은 :"+ avg);
		System.out.println("최고점수는 :"+ max);
		System.out.println("최고점수는 :"+ min);
		System.out.println("====================");
		//Arrays.sort()이용방법
		//오름차순 배열 정리
//		Arrays.sort(scores);
//		System.out.println("최고점수는 :"+ scores[0]);
//		System.out.println("최고점수는 :"+ scores[scores.length-1]);
	}
}
