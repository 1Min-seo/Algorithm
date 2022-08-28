package Level6;
import java.util.*;
public class level6_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int result=0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='C') result+=3;
			if(str.charAt(i)>='D' && str.charAt(i)<='F') result+=4;
			if(str.charAt(i)>='G' && str.charAt(i)<='I') result+=5;
			if(str.charAt(i)>='J' && str.charAt(i)<='L') result+=6;
			if(str.charAt(i)>='M' && str.charAt(i)<='O') result+=7;
			if(str.charAt(i)>='P' && str.charAt(i)<='S') result+=8;
			if(str.charAt(i)>='T' && str.charAt(i)<='V') result+=9;
			if(str.charAt(i)>='W' && str.charAt(i)<='Z') result+=10;
		}
		
		System.out.println(result);
	}

}
