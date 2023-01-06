//상하좌우
package ECT_main_1;

import java.util.Scanner;
public class Implementation_1 {
	
	public static void main(String[] args) {
		//1. n 값을 입력 받는다.
		//2. 이동할 계획서를 입력 받는다.
		//3. 동서남북의 방향을 지정하는 moveType 배열을 만든다.
		//4. 계획서와 moveType 배열을 하나씩 비교하며 방향을 움직인다.
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] plans=sc.nextLine().split(" ");
		//동북서남
		int []dx= {0,-1,0,1};
		int []dy= {1,0,-1,0};
		char []moveTypes= {'R','U','L','D'};
		int x=1;
		int y=1;
		
		for(int i=0; i<plans.length; i++) {
			int nx=0;
			int ny=0;
			char plan=plans[i].charAt(0);
			for(int j=0; j<moveTypes.length; j++) {
				if(plan==moveTypes[j]) {
					nx=x+dx[j];
					ny=y+dy[j];
				}
			}
			if(nx<1 || ny<1 || nx>n || ny>n) continue;
			x=nx;
			y=ny;
		}
		System.out.println(x+" "+y);
	}
	
}
