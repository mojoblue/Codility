package missingInteger;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	
	public int solution(int[] A) {
		int answer = 1;
		Set<Integer> hset = new HashSet<Integer>();
		for(int e : A)
			hset.add(e);
		for(int i=1; i<=100001; i++) {
			if(!hset.contains(i))
				return i;
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int A[] = {-1, -3};
		System.out.println(s.solution(A));
	}

}
