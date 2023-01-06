//왕실의 나이트
package ECT_main_1;
import java.util.*;
public class Implementation_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		
		int row=data.charAt(1)-'0';
		int col=data.charAt(0)-'a'+1;
		
		int initx=row;
		int inity=col;
		int cnt=0;
		
		//이동 좌표
		int []dx= {-2,-2,-1,-1,1,1,2,2};
		int []dy= {-1,1,-2,2,-2,2,-1,1};
		int nx=0;
		int ny=0;
		for(int i=0; i<8; i++) {
			nx=initx+dx[i];
			ny=inity+dy[i];
			
			if(nx>8 || ny>8 || nx<1 || ny<1) continue;
			cnt+=1;
		}
		
		System.out.println(cnt);
	}
		
}
