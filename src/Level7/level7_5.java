package Level7;
import java.util.*;

public class level7_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int docase=sc.nextInt();
		
		for(int i=0; i<docase; i++) {
			int H=sc.nextInt(); //층
			int W=sc.nextInt(); //호
			int N=sc.nextInt(); //N번째 손님
			
			if(N%H==0) {
				System.out.println((H*100)+(N/H));
			}
			else {
				System.out.println((N%H)*100+(N/H)+1);
			}
		}	

	}

}
