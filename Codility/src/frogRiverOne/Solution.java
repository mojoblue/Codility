package frogRiverOne;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	
	public int solution(int X, int[] A) {
		int answer = -1;
		HashSet<Integer> hset = new HashSet<Integer>();
		for(int i=1; i<=X; i++)
			hset.add(i);
		for(int i=0; i<A.length; i++) {
			if(hset.contains(A[i])) {
				hset.remove(A[i]);
				if(hset.isEmpty())
					return i;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int A[] = {1, 1, 2};
		System.out.println(s.solution(3, A));

	}

}
