package Level7;
import java.util.*;
public class level7_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt(); //고정비용
		int B=sc.nextInt(); //가변비용
		int C=sc.nextInt(); //노트북 가격
		
		if(B>=C) System.out.println(-1);
		else System.out.println((A/(C-B))+1);

	}

}
