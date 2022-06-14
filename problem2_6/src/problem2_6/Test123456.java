package problem2_6;

public class Test123456 {
	public static void main(String[] args) {
		
	
    String arr []= {"a","b","c","d","e"};
    for(int i=0;i<=arr.length-1;i++) {
       for(int j=i;j<=arr.length-1;j++) {
          System.out.print("*");
       }
       for(int j=0;j<=i;j++) {
          System.out.print(arr[j]);
       }
       for(int j=0;j<=i;j++) {
          System.out.print(arr[i-j]);
       }
       System.out.println();
    }
    for(int i=0;i<=arr.length-1;i++) {
       for(int j=0;j<=i;j++) {
          System.out.print(" ");
       }
       for(int j=i;j<=arr.length-1;j++) {
          System.out.print(arr[j-i]);
       }
       for(int j=i;j<=arr.length-1;j++) {
          System.out.print(arr[(arr.length-1)-j]);
       }
       System.out.println();
    }
 }
}
