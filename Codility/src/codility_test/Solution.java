package codility_test;

import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 3, 6, 4, 1, 2};
		System.out.println(solution(a));
	}
	public static int solution(int[] A) {
		int answer = 1;	
		HashSet<Integer> hset = new HashSet<Integer>();
		for(int e : A)
			hset.add(e);
		
		while(true) {
			if(hset.contains(answer)) {
				answer++;
				continue;
			}else {
				break;
			}
		}
		return answer;
	}
	
}
