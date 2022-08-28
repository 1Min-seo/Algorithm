//1이 될 때까지
package ECT_main_1;
import java.util.*;

public class Greedy_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int cnt=0;
		
		while(true) {
			
			int target=(n/k)*k;
			cnt+=(n-target);
			n=target;
			
			if(n<k) break;
			
			cnt+=1;
			n/=k;
		}
		
		//마지막으로 남은 수에 대하여 1씩 빼기
		cnt+=(n-1);
		System.out.println(cnt);
	}

}
