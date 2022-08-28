//모험가 길드
package ECT_main_1;
import java.util.Arrays;
import java.util.Scanner;
public class Greedy_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		int result=0; //그룹의 수
		int cnt=0; //현재 그룹에 포함된 모험가의 수
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			cnt+=1;
			if(cnt>=arr[i]) {
				result+=1;
				cnt=0;
			}
		}
		System.out.println(result);
	}

}
