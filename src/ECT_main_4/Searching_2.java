//떡볶이 떡 만들기
package ECT_main_4;
import java.util.*;
public class Searching_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//1. 떡의 개수와 떡의 길이 입력받기
		int n=sc.nextInt();
		int m=sc.nextInt();
		int []arr=new int[n];
		
		//2. 떡의 개별 높이 입력받기
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		//가장 긴 떡의 길이 구하기
		int end=arr[0];
		for(int i=1; i<n; i++) {
			if(end<arr[i]) end=arr[i];
		}
		
		int start=0;
		//남은 떡의 개수 더하기
		int result=0;
		
		while(start<=end) {
			int total=0;
			int mid=(start+end)/2;
			
			for(int i=0; i<arr.length; i++) {	
				if(arr[i]>=mid) {
					total+=arr[i]-mid;
				}
				
				if(total>=m) {
					start=mid+1;
					result=mid;
				}		
				else end=mid-1;
			}
		}
		
		System.out.println(result);
	}

}
