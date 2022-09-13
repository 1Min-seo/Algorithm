//안전 영역
package baek_dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class dfs_2468 {
	public static int n;
	public static int[][]map=new int[100][100]; //마을 지도
	public static int max=0; //높이의 최댓값
	
	//물에 잠기지 않는 영역의 수를 담는 배열
	public static ArrayList<Integer> list;
	public static int cnt=0; //잠기지 않은 영역의 수 카운팅
	public static int max_cnt=0;
	public static boolean visited[][]=new boolean[100][100];
	public static int dx[]= {-1,0,0,1};
	public static int dy[]= {0,-1,1,0};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		n=sc.nextInt();
		sc.nextLine();
		map=new int[n][n];
		visited=new boolean[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				map[i][j]=sc.nextInt();
			}
		}
		sc.close();
		
		//최댓값 반환받기
		max=maxNum();
		
		list=new ArrayList<>();
		list.add(1);
		
		//하나씩 비교하며 잠기지 않는 개수 세기
		for(int k=1; k<=max; k++) {
			cnt=0;
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(map[i][j]>k && !visited[i][j]) {
						dfs(i,j,k);
						cnt++;
					}
				}
			}
			list.add(cnt);
		}
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
		

	}
	
	public static int maxNum() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				max= max<map[i][j]?map[i][j]:max;
			}
		}
		
		return max;
	}
	
	public static void dfs(int x, int y, int z) {
		visited[x][y]=true;
		max=maxNum();
		
		for(int i=0; i<4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx>=0 && nx<n && ny>=0 && ny<n) {
				for(int k=1; k<max; k++) {
					if(map[nx][ny]>k && !visited[nx][ny]) {
						dfs(nx,ny,z);
					}
				}
			}
		}
		
	}

}
