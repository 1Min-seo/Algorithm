package Level6;
import java.util.*;
public class level6_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt(); //케이스의 개수
		
		for(int i=0; i<n; i++) {
			int setN=sc.nextInt(); //각 케이스의 반복 횟수
			String str=sc.next(); //입력받은 문자열
			for(int j=0; j<str.length(); j++) { 
				char ch=str.charAt(j); //문자열 한글자씩 분리
				for(int k=0; k<setN; k++) { //반복 횟수만큼 출력
					System.out.print(ch);
				}
			}
			System.out.println();
		}
		
	}

}
