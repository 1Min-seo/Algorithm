//큰 수의 법칙
package ECT_main_1;
import java.util.*;

public class Greedy_5 {
	public static void main(String[] args) {
		
		//1. N, M, K 값을 입력
		//2. 배열 값을 입력
		//3. 배열을 큰 순으로 정렬
		//4. 반복문 while로 cnt를 하나씩 증가시키면서 cnt가 M이 될 때 종료
		//5. K만큼 for문을 돌리고 끝나면 두번 째 값을 하나 더하고 다시 첫 번째 값을 더하는 형태로
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int M=sc.nextInt();
		int K=sc.nextInt();
		int []arr=new int[N];
		for(int i=0; i<N; i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int first=arr[N-1];
		int second=arr[N-2];
		int cnt=0;
		int result=0;
		
		while(true) {
			if(cnt==M) break;
			for(int i=0; i<K; i++) {
				cnt+=1;
				result+=first;
				if(cnt==M) break;
				
			}
			if(cnt==M) break;
			result+=second;
			cnt+=1;
		}
		
		System.out.println(result);
	}

}
