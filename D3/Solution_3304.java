/*
 * [D3] 3304. 최장 공통 부분 수열
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3304 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			String s1 = st.nextToken(), s2 = st.nextToken();
			int x = s1.length()+1, y = s2.length()+1;
			
			int[][] dp = new int[x][y];
			for (int i = 1; i < x; i++) {
				char tmp = s1.charAt(i-1);
				
				for (int j = 1; j < y; j++)
					dp[i][j] = (tmp == s2.charAt(j-1)) ? dp[i-1][j-1]+1 : Math.max(dp[i][j-1], dp[i-1][j]);
			}
			
			System.out.println("#"+t+" "+dp[x-1][y-1]);
		}
	}
}