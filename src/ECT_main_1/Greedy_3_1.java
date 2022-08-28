//숫자 카드 게임
package ECT_main_1;
import java.util.*;

public class Greedy_3_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt(); //행
		int m=sc.nextInt(); //열
		int [][]arr=new int[n][m];
		int result=0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			int min=arr[i][0];
			for(int j=0; j<m; j++) {
				
				if(min>arr[i][j]) {
					min=arr[i][j];
				}
			}
			
			result=min;
		}
		System.out.println(result);
	}

}

