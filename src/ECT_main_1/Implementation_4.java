//문자열 재정렬
package ECT_main_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Implementation_4 {


	public static void main(String[] args) {
		//1. 문자열을 입력 받는다.
		//2. 한 글자씩 문자를 읽으며 해당 문자가 문자열이면 문자열 배열에 넣는다.
		//3. 해당 문자가 숫자라면 숫자를 더한다.
		//4. 문자열 배열을 정렬한다.
		//5. 문자열 배열 뒤에 숫자열 배열을 이어서 출력한다.
		
		Scanner sc=new Scanner (System.in);
		String str=sc.next();
		ArrayList<Character> charList=new ArrayList<Character>();
		int value=0;
		
		for(int i=0; i<str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) {
				charList.add(str.charAt(i));
			}
			else {
				value+=str.charAt(i)-'0';
			}
		}
		
		Collections.sort(charList);
		
		for(int i=0; i<charList.size(); i++) {
			System.out.print(charList.get(i));
		}
		System.out.println(value);
	}
}


