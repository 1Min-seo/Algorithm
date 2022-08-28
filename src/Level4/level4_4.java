//다시
package Level4;
import java.util.*;
public class level4_4 {

	public static void main(String[] args) {
		boolean[]arr=new boolean[42];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			arr[(sc.nextInt())%42]=true;
		}
		
		int cnt=0;
		for(boolean value:arr) {
			if(value) cnt+=1;
		}
		System.out.println(cnt);
	}
}
