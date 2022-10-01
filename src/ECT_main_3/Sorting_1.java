// 위에서 아래로
package ECT_main_3;

import java.util.*;

public class Sorting_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		Integer []arr=new Integer[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
