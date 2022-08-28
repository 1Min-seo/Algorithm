//다시
package Level4;
import java.util.*;

public class level4_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test_case=sc.nextInt();
		
		for(int i=0; i<test_case; i++) {
			int str_Num=sc.nextInt(); //학생 수
			double sum=0; //점수 합
			double avg=0; //평균
			double cnt=0; //평균을 넘는 학생 수
			double result=0; //평균 넘는 학생 비율
			double []score_arr=new double[str_Num];
			for(int j=0; j<str_Num; j++) {		
				score_arr[j]=sc.nextInt();
				sum+=score_arr[j];
				}
			
			for(int k=0; k<str_Num; k++) {
				avg=sum/str_Num;
				if(score_arr[k]>avg) {
				cnt+=1;
				}		
			}
			result=(cnt/str_Num)*100;	
			System.out.printf("%.3f",result);
			System.out.println("%");
		}	

	}
}