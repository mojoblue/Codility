package permCheck;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int solution(int[] A) {
		int answer = 1;
		Set<Integer> hset = new HashSet<Integer>();
		for(int e:A) {
			if(hset.contains(e))
				return 0;
			else
				hset.add(e);
		}
		for(int i=1; i<=A.length; i++) {
			if(!hset.contains(i))
				return 0;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
//		int A[] = {4, 1, 3, 2};
		int A[] = {4, 3, 2};
		int B[] = {1, 1};
		int answer = s.solution(A);
		int answer2 = s.solution(B);
		System.out.println(answer);
		System.out.println(answer2);
	}

}
