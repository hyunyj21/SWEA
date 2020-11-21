/*
 * [D3] 5642. [Professional] 합
 */

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class Solution_5642 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			
			int[] dp = new int[N];
			dp[0] = Integer.parseInt(st.nextToken());
			
			int ans = dp[0];
			for (int i = 1; i < N; i++) {
				dp[i] = Integer.parseInt(st.nextToken());
				
				if (dp[i-1] > 0 && dp[i-1]+dp[i] > 0) dp[i] += dp[i-1];
				if (dp[i] > ans) ans = dp[i];
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}