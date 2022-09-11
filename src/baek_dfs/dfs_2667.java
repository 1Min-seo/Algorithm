package baek_dfs;

import java.util.Arrays;
import java.util.Scanner;

public class dfs_2667 {
	
	public static int n;
	public static int map[][]=new int[25][25];
	public static boolean visited[][]=new boolean[25][25];
	public static int totalNum=0; // 총 단지 수
	public static int []townNum=new int[25*25]; //각 단지당 아파트의 수
	public static int dx[]= {-1,0,0,1};
	public static int dy[]= {0,-1,1,0};
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.nextLine();
		map=new int[n][n];
		visited=new boolean[n][n];
		
		for(int i=0; i<n; i++) {
			String str=sc.next();
			for(int j=0; j<n; j++) {
				map[i][j]=str.charAt(j)-'0';
			}
		}
		sc.close();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j]==1 && !visited[i][j]) {
					totalNum++;
					dfs(i,j);
				}
			}
		}
		System.out.println(totalNum);
		Arrays.sort(townNum);
		for(int i=0; i<townNum.length; i++) {
			if(townNum[i]==0) {
			}else {
				System.out.println(townNum[i]);
			}
		}

	}
	
	public static void dfs(int x, int y) {
		visited[x][y]=true;
		townNum[totalNum]++;
		for(int i=0; i<4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx>=0 && nx<n && ny>=0 && ny<n) {
				if(map[nx][ny]==1 && !visited[nx][ny])
					dfs(nx,ny);
			}
		}
	}

}
