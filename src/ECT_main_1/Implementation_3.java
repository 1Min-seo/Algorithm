//왕실의 나이트
package ECT_main_1;
import java.util.*;
public class Implementation_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p1=sc.next().charAt(0)-'a'+1;
		int p2=sc.nextInt();
		
		int []dx= {-2,-2,-1,-1, 2, 2, 1, 1};
		int []dy= {-1, 1,-2, 2, 1,-1,-2, 2};
		int result=0;
		
		for(int i=0; i<8; i++) {
			int nx=p1+dx[i];
			int ny=p2+dy[i];
			
			if(nx<1 || nx>8 || ny<1 || ny>8) continue;
			result+=1;
		}
		System.out.println(result);
	}
		
}
