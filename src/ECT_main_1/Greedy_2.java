//1이 될 때까지
package ECT_main_1;
import java.util.Arrays;
import java.util.Scanner;

public class Greedy_2 {

	public static void main(String[] args) {
		//1. N과 K를 입력받는다.
		//2. K는 2이상의 자연수 이므로 1을 뺀 것 보다 나누는 것이 숫자가 크게 줄어든다.
		//3. N에서 K를 나눈 나머지의 값만큼 카운트를 센다.
		//4. N을 K로 나눈다. 이 값은 다시 N이 된다.
		//5. 이를 반복한다.
		//6. N이 K보다 작을 때 반복문을 나오게 되는데 1이 되어야 하므로 1을 뺀 값을 카운트에 더한다.

		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int cnt=0;
		
		while(true) {
			if(N<K) break;
			cnt+=N%K;
			N/=K;
			cnt+=1;
		}
		
		cnt+=N-1;
		System.out.println(cnt);
	}
}
