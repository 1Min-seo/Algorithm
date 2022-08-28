package Level6;
import java.util.*;
public class level6_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int a_100=(a%10)*100;
		int a_10=(a/10%10)*10;
		int a_1=a/100;
		int a_result=a_100+a_10+a_1;
		
		int b_100=(b%10)*100;
		int b_10=(b/10%10)*10;
		int b_1=b/100;
		int b_result=b_100+b_10+b_1;
		
		System.out.println(a_result>b_result?a_result:b_result);

	}

}
