package Level3;
import java.util.*;

public class level3_14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int copy=n;
		int result=0;
		
		while(true) {
			int n_10=(n%10)*10;
			int n_1=((n/10)+(n%10))%10;
			result+=1;
			
			if(copy==n_10+n_1) break;
			n=n_10+n_1;
			
		}
		
		System.out.println(result);
		
	}
}
