//음료수 얼려 먹기
package ECT_main_2;

import java.util.Scanner;

public class dfs_bfs_1 {
	
	public static int n;
	public static int m;
	public static int graph[][];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		m=sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++) {
			String str=sc.next();
			for(int j=0; j<m; j++) {
				graph[i][j]=str.charAt(j)-'0';
			}
		}
		sc.close();
		
		int result=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(dfs(i,j)) result+=1;
			}
		}
		System.out.println(result);
	}
	
	public static boolean dfs(int x, int y) {
		if(x<=-1 || x>=n || y<=-1 || y>=m) return false;
		if(graph[x][y]==0) {
			dfs(x-1,y);
			dfs(x,y-1);
			dfs(x+1,y);
			dfs(x,y+1);
			return true;
		}
		return false;
	}
	
}

//특정 지점에서 상하좌우를 살핀다.
//주변 지점에서 값이 0이면서 아직 방문하지 않은 지점이 있으면 해당 지점을 방문한다.
//방문한 지점에서 다시 상하좌우를 살피며 반복하면 연결된 모든 지점을 방문할 수 있다.
//계속 반복하며 방문하지 않은 지점의 수를 센다.



