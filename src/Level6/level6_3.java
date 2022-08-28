package Level6;
import java.util.*;
public class level6_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		int []array=new int[26];
		int cnt=0;
		
		for(int i=0; i<array.length; i++) {
			array[i]=-1;
		}
		
		for(int j=0; j<str.length(); j++) {
			char ch=str.charAt(j);
				if(array[ch-'a']==-1) {
					array[ch-'a']=j;
				}
			}
		
		for(int val:array) System.out.print(val+" ");
	}		

}

