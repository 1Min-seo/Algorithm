//곱하기 혹은 더하기 문제
package ECT_main_1;
import java.util.*;

public class Greedy_3 {

	public static void main(String[] args) {
		
		//1. 문자열을 입력 받는다.
		//2. 왼쪽부터 하나씩 확인하며 0이나 1일 경우는 더하기 연산자
		//3. 0이나 1이 아닐 경우는 곱하기 연산자를 사용
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		int result=str.charAt(0)-'0';
		
		for(int i=1; i<str.length(); i++) {
			int num=str.charAt(i)-'0';
			
			if(result<=1 || num<=1) {
				result+=num;
			}
			else result*=num;
		}
		
		System.out.println(result);
		
		
		
		
	
	}

}

