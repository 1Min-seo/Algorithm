//정렬된 배열에서 특정 수의 개수 구하기 (이진탐색 이용하기)
package ECT_main_4;
import java.util.*;

public class Searching_3 {
	
	public static int leftIndex(int []arr, int start, int end, int x) {
		while(start<end) {
			int mid=(start+end)/2;
			if(arr[mid]<x) {
				start=mid+1;
			}
			else end=mid;
		}
		return end;
	}
	
	public static int rightIndex(int []arr, int start, int end, int x) {
		while(start<end) {
			int mid=(start+end)/2;
			if(arr[mid]<=x) start=mid+1;
			else end=mid;
		}
		return end;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int x=sc.nextInt();
		int []arr=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		

	}

}
