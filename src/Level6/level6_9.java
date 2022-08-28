package Level6;
import java.util.*;
public class level6_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int cnt=0;
		
		String []strarr= {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0; i<strarr.length; i++) {
			if(str.contains(strarr[i])) {
				str=str.replace(strarr[i], "0");
			}
		}
		
		System.out.println(str.length());
		
	}

}
