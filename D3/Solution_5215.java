/*
 * [D3] 5215. 햄버거 다이어트
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_5215 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
			int[] T = new int[N+1];
			int[] K = new int[N+1];
			
			for (int i = 1; i <= N; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				T[i] = Integer.parseInt(st.nextToken());
				K[i] = Integer.parseInt(st.nextToken());
			}
			
			int[][] dp = new int[N+1][L+1];
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= L; j++) {
					if (K[i] > j) dp[i][j] = dp[i-1][j];
					else dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-K[i]]+T[i]);
				}
			}
			System.out.println("#"+t+" "+dp[N][L]);
		}
	}
}