package Level5;
import java.util.Scanner;

public class level5_3 {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=han(n);
		System.out.println(result);
	}
	
	public static int han(int n) {
		int cnt=0;
		for(int i=1; i<=n; i++) {
			if(i<100) cnt+=1;
			else {
				if(((i%10)-(i/10%10))==((i/10%10)-(i/10/10)))
					cnt+=1;
			}
		}
		return cnt;
	}
 
}
