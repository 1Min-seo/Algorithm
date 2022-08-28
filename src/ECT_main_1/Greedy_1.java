//거스름 돈
package ECT_main_1;
import java.util.*;
public class Greedy_1 {

	public static void main(String[] args) {
		int []coinTypes= {500,100,50,10};
		Scanner sc=new Scanner(System.in);
		
		int coin=sc.nextInt();
		int cnt=0;
		
		for(int i=0; i<coinTypes.length; i++) {
			cnt+=coin/coinTypes[i];
			coin%=coinTypes[i];
		}
		System.out.println(cnt);
		
	}

}
