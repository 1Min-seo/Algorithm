package Level6;
import java.util.*;

public class level6_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		int []array=new int[26];
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				array[ch-'a']++;
			}
			else if(ch>='A' && ch<='Z') {
				array[ch-'A']++;
			}
		}
		
		int max=0;
		char result=(char)(65);
		for(int j=0; j<array.length; j++) {
			
			if(max<array[j]) {
				max=array[j];
				result=(char)(j+65);
			}
			
			else if(max==array[j]) result='?';
		}
		
		System.out.println(result);
	}

}
