//곱하기 혹은 더하기
package ECT_main_1;
import java.util.*;

public class Greedy_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int result=s.charAt(0)-'0';
		for(int i=1; i<s.length(); i++) {
			int number=s.charAt(i)-'0';
			if(result==0 || result==1) {
				result+=number;
			}
			else {
				result*=number;
			}
		}
		
		System.out.println(result);

	}

}
