//큰 수의 법칙
package ECT_main_1;
import java.util.Arrays;
import java.util.Scanner;

public class Greedy_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //배열 크기
		int m=sc.nextInt(); //총 m번 더함
		int k=sc.nextInt(); //최대 k번 더할 수 있음
		Integer []arr=new Integer[n];
		int result=0;
		int cnt=0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int first=arr[n-1];
		int second=arr[n-2];
		
		//가장 큰 수 더하는 횟수
		cnt=m/(k+1)*k;
		cnt+=m%(k+1);
		result=first*cnt;
		
		//두 번째로 큰 수 더하기
		result+=(second*(m/(k+1))); //또는 m에서 count를 뺴도 됨.
		
		System.out.println(result);
		
	}
}
