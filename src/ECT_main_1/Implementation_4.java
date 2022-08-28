//문자열 재정렬
package ECT_main_1;
import java.util.*;
public class Implementation_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		ArrayList<Character> charList=new ArrayList<Character>();
		int sum=0;
		
		for(int i=0; i<str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) {
				charList.add(str.charAt(i));
			}
			else {
				sum+=str.charAt(i)-'0';
			}
		}
		Collections.sort(charList);
		
		for(int i=0; i<charList.size(); i++) {
			System.out.print(charList.get(i));
		}
		System.out.println(sum);
	}

}

//알페벳 대문자와 숫자가 섞인 문자열을 입력 받는다.
//문자열이 입력 되었을 때 문자를 하나씩 확인한다.
//알파벳은 따로 리스트에 저장한다.
//숫자는 합한다.
//리스트에 저장된 알파벳을 출력한 다음 숫자를 붙여 출력한다.
