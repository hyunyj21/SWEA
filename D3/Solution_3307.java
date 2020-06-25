/*
 * [D3] 3307. 최장 증가 부분 수열
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3307 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int[] num = new int[N];
			
			for (int i = 0; i < N; i++)
				num[i] = Integer.parseInt(st.nextToken());
			
			int ans = 1;
			int[] dp = new int[N];
			for (int i = 0; i < N; i++) {
				dp[i] = 1;
				
				for (int j = 0; j < i; j++) {
					if (num[i] < num[j]) continue;
					
					int tmp = dp[j];
					if (ans == tmp) {
						dp[i] = ans = tmp + 1;
						break;
					}
					
					dp[i] = Math.max(dp[i], tmp + 1);
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}