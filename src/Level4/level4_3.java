package Level4;
import java.util.*;

public class level4_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		String str=Integer.toString(a*b*c);
		
		
		for(int i=0; i<10; i++) {
			int cnt=0;
			for(int j=0; j<str.length(); j++) {
				if((str.charAt(j)-'0')==i) cnt+=1;
			}
			System.out.println(cnt);
		}
		
		

	}

}
