package Level2;
import java.util.*;

public class level2_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int m=sc.nextInt();
		
		if(m>=45) {
			m-=45;
		}
		else {
			if(h==0) h=23;
			else h-=1;
			m=60+m-45;
			
		}
		
		System.out.println(h+" "+m);

	}

}
