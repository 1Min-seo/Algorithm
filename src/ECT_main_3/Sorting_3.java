//두 배열의 원소 교체
package ECT_main_3;

import java.util.*;

public class Sorting_3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		sc.nextLine();
		Integer[] arrA=new Integer[n];
		Integer[] arrB=new Integer[n];
		
		for(int i=0; i<n; i++)
			arrA[i]=sc.nextInt();
		
		for(int i=0; i<n; i++)
			arrB[i]=sc.nextInt();
		
		Arrays.sort(arrA);
		Arrays.sort(arrB, Collections.reverseOrder());
		
		for(int i=0; i<k; i++) {
			if(arrA[i]<arrB[i]) {
				int tmp=arrA[i];
				arrA[i]=arrB[i];
				arrB[i]=tmp;
			}
			else break;
		}
		
		int result=0;
		for(int i=0; i<n; i++) {
			result+=arrA[i];
		}
		
		System.out.println(result);
	}

}

// 배열 A에서 가장 작은 원소를 골라 배열 B에서 가장 큰 원소와 교체
// A는 오름차순 B는 내림차순으로 정렬한다.
// A의 원소가 B의 원소보다 작을 때만 교체 수행
