//숫자 카드 게임
package ECT_main_1;
import java.util.Scanner;
public class Greedy_6 {
	
	//1. N과 M의 값을 입력 받는다.
	//2. 배열을 입력 받는다.
	//3. 행마다 가장 작은 값을 저장하며 다음 행이 진행될 떄마다 계속 비교한다.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int M=sc.nextInt();
		int result=0;
		
		for(int i=0; i<N; i++) {
			int minValue=10001;
			for(int j=0; j<M; j++) {
				int colx=sc.nextInt();
				minValue=Math.min(minValue,colx);
			}
			
			result=Math.max(result, minValue);
		}
		
		System.out.println(result);
	}

}
