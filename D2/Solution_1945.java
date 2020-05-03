/*
 * [D2] 1945. 간단한 소인수분해
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1945 {
	static int[] prime = {2, 3, 5, 7, 11};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			int N = Integer.parseInt(in.readLine());
			
			for (int i = 0; i < 5; i++) {
				int cnt = 0;
				
				while(N%prime[i] == 0) {
					N /= prime[i];
					cnt++;
				}
				
				sb.append(cnt).append(" ");
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}