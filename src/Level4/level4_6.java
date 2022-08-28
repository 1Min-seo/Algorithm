package Level4;
import java.util.*;
public class level4_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String []arr=new String[n];
	
		for(int i=0; i<n; i++) {
			arr[i]=sc.next();
		}
		
		for(int i=0; i<arr.length; i++) {
			int cnt=0;
			int sum=0;
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j)=='O') {
					cnt+=1;
				}
				else
					cnt=0;
				sum+=cnt;
				
			}
			System.out.println(sum);
		}
		
		
	}

}
