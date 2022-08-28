package Level5;
import java.util.*;
public class level5_2 {
	
	public static void main(String[] args) {
		boolean []array=new boolean[10001];
		for(int i=1; i<=10000; i++) {
			int n=d(i);
			array[n]=true;
		}
		
		for(int i=1; i<=10000; i++) {
			if(!array[i])
				System.out.println(i);
		}
		
	}
	
	public static int d(int n) {
		int sum=n;
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		if(sum<=10000) return sum;
		return 0;
	}
}
