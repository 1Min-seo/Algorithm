package Level7;
import java.util.*;
public class level7_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int testCase=sc.nextInt();
		//아파트 생성
		int arr[][]=new int[15][15];
		
		for(int i=0; i<testCase; i++) {
			int cnt=0;
			int k=sc.nextInt(); //층
			int n=sc.nextInt(); //호
			
			for(int j=0; k<15; j++) {
				arr[0][j]=j;
				arr[j][1]=1;
			}
			
			for(int j=1; j<15; j++) {
				for(int z=2; z<15; z++) {
					arr[j][z]=arr[j-1][z]+arr[j][z-1];
				}
			}
			
			System.out.println(arr[k][n]);
			
		}
		
		
	}

}
