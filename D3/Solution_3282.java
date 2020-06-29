/*
 * [D3] 3282. 0/1 Knapsack
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3282 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken())+1;
			int K = Integer.parseInt(st.nextToken())+1;
			int[][] product = new int[N][2];
			
			for (int i = 1; i < N; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				product[i][0] = Integer.parseInt(st.nextToken());
				product[i][1] = Integer.parseInt(st.nextToken());
			}
			
			int[][] dp = new int[N][K];
			for (int i = 1; i < N; i++) {
				int v = product[i][0];
				int c = product[i][1];
				
				for (int j = 1; j < K; j++) {
					if (v <= j) dp[i][j] = Math.max(c+dp[i-1][j-v], dp[i-1][j]);
					else dp[i][j] = dp[i-1][j];
				}
			}
			
			System.out.println("#"+t+" "+dp[N-1][K-1]);
		}
	}
}