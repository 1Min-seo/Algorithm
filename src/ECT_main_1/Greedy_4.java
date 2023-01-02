//모험가 길드
package ECT_main_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Greedy_4 {
	public static ArrayList<Integer> arrayList= new ArrayList<>();
	public static void main(String[] args) {
		
		//1. 공포도를 담을 수 있는 배열 작성
		//2. 최대한 많은 그룹을 만들어야 하므로 공포도가 적은 사람 순으로 정렬한다.
		//3. 그룹 배열이 공포도를 합한 것 보다 크거나 같으면 된다.
		
		// ** Arrays.sort() vs Collections.sort() **
		// 같은 sort 메서드이지만 내부에서는 다른 정렬방식을 사용하여 정렬한다.
		// 시간복잡도도 달라 효율성 테스트의 성공/실패 결과가 달라진다.
		// Arrays.sort() 평균 : O(nlog(n)) 최악 : O(n^2)
		// Collections.sort() 평균, 최악 : O(nlog(n))
		
		//Collections의 sort()가 더 빠르기 때문에 주로 이걸 택한다.
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			arrayList.add(sc.nextInt());
		}
		Collections.sort(arrayList);
		
		int result=0; //총 그룹의 수
		int cnt=0; // 현재 그룹에 포함된 모험가의 수
		
		for(int i=0; i<n; i++) {
			cnt+=1;
			if(cnt>=arrayList.get(i)) {
				result+=1;
				cnt=0;
			}
		}
		System.out.println(result);
	}

}
