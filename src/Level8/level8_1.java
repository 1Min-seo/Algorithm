package Level8;
import java.util.*;
public class level8_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int cnt=0;
		int []arr=new int[n];
		int result=0;
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=2; j<=arr[i]-1; j++) {
				if(arr[i]==1) break;
				if(arr[i]%j!=0) {
					cnt+=1;
				}
				cnt=0;
			}
			if(cnt>1) result+=1;
		}
		
		System.out.println(result);
	}

}
