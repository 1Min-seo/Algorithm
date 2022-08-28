package ECT_main_1;

import java.util.*;

public class Greedy_3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;
        
        for(int i=0; i<n; i++) {
        	int min=1001;
        	for(int j=0; j<m; j++) {
        		int x=sc.nextInt();
        		min=Math.min(min, x);
        	}
        	result=Math.max(result, min);
        }
        
        System.out.println(result);
	}

}
