//상하좌우
package ECT_main_1;

import java.util.Scanner;
public class Implementation_1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] plans=sc.nextLine().split(" ");
		
		//처음 위치
		int x=1;
		int y=1;
		
		int []dx= {0,0,-1,1};
		int []dy={-1,1,0,0};
		char []mvType= {'L','R','U','D'};
		
		for(int i=0; i<plans.length; i++) {
			char plan=plans[i].charAt(0);
			int nx=-1;
			int ny=-1;
			for(int j=0; j<mvType.length; j++) {
				if(plan==mvType[j]) {
					nx=x+dx[j];
					ny=y+dy[j];
				}
			}
			if(nx<1 || ny<1 || nx>x || ny>n) continue;
			x=nx;
			y=ny;
		}
		
		System.out.println(x+" "+y);
	}
	
}
