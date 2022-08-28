package Level4;
import java.util.*;

public class level4_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		double array[]=new double[n];
		
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		
		double m=array[n-1];
		double sum=0;
		
		for(int i=0; i<n; i++) {
			sum+=(array[i]/m*100);
		}
		
		double avg=sum/n;
		
		System.out.println(avg);
	}

}