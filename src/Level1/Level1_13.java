package Level1;
import java.util.*;

public class Level1_13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		String b=sc.next();
		
		for(int i=2; i>-1; i--) {
			System.out.println(a*(b.charAt(i)-'0'));
		}
		
		System.out.println(a*Integer.parseInt(b));

	}

}