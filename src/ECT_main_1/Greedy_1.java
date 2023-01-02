//거스름 돈
package ECT_main_1;
import java.util.*;
public class Greedy_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int coin[]= {500,100,50,10};
		int cnt=0;
		
		int N=sc.nextInt();
		for(int i=0; i<coin.length; i++) {
			cnt+=N/coin[i];
			N%=coin[i];
		}
		
		System.out.println(cnt);
		
	}
} 
