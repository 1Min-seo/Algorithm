//부품 찾기
package ECT_main_4;

import java.util.*;
public class Searching_1 {
	
	public static int binarySearch(int []arr, int target, int start, int end) {
		while(start<end) {
			int mid=(start+end)/2;
			//찾으면 중간 인덱스 반환
			if(target==arr[mid]) return mid;
			//중간 인덱스 값보다 타겟이 작으면 왼쪽을 확인한다.
			else if(arr[mid]>target) end=mid-1;
			//중간 인덱스 값보다 타겟이 크면 오른쪽을 확인한다.
			else start=mid+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//매장 부품의 개수
		int n=sc.nextInt();
		//매장 부품의 길이
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		//이진 탐색을 위해 정렬
		Arrays.sort(arr);
		
		//찾는 부품의 개수
		int c=sc.nextInt();
		//찾는 부품의 길이
		int[] targets=new int[c];
		for(int i=0; i<c; i++) {
			targets[i]=sc.nextInt();
		}
		
		//손님의 의뢰한 부품을 하나씩 확인
		for(int i=0; i<c; i++) {
			//매장에 부품이 있는지 확인
			int result=binarySearch(arr,targets[i],0,n-1);
			if(result==-1) System.out.print("no");
			else System.out.print("yes");
		}
	}

}


