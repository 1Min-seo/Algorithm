package Level6;
import java.util.*;
public class level6_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String []strarr=str.split(" ");
		int cnt= strarr.length;
		
		if(cnt==0) {
			System.out.println(0);
			return;
		}
		if(strarr[0]=="")cnt-=1;
		if(strarr[strarr.length-1]=="") cnt-=1;
		
		System.out.println(cnt);
	}

}
