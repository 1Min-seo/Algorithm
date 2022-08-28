//시각
package ECT_main_1;
import java.util.*;
public class Implementation_2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=0; 
		
		for(int h=0; h<=n; h++) {
			for(int m=0; m<60; m++) {
				for(int s=0; s<60; s++) {
					if (check(h,m,s)) result+=1;
				}
			}
		}
		
		System.out.println(result);
	}
	
	public static boolean check(int h, int m, int s) {
		if(h%10==3 || m/10==3 || m%10==3 || s/10==3 || s%10==3) {
			return true;
		}
		return false;
	}
}
