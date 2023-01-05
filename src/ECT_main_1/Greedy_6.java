//숫자 카드 게임
package ECT_main_1;
import java.util.Scanner;
public class Greedy_6 {
	
	
	// 행마다 가장 작은 값을 저장하며 다음 행이 진행될 떄마다 큰 수를 비교한다.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int result=0;
		
		for(int i=0; i<N; i++) {
			int minValue=10001; //초기화 작업
			for(int j=0; j<M; j++) {
				int x=sc.nextInt();
				minValue=Math.min(minValue, x);
			}
			result=Math.max(result, minValue);
		}
		System.out.println(result);
	}

}
