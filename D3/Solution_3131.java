/*
 * [D3] 3131. 100만 이하의 모든 소수
 */

public class Solution_3131 {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		boolean[] prime = new boolean[1000000];
		
		for (int i = 2; i*i < 1000000; i++) {
			if (prime[i]) continue;
			
			for (int j = i*i; j < 1000000; j+=i)
				prime[j] = true;
		}
		
		for (int i = 2; i < 1000000; i++) {
			if (!prime[i]) sb.append(i).append(" ");
		}
		
		System.out.println(sb);
	}
}