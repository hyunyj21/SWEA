/*
 * [D3] 3307. 최장 증가 부분 수열
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3307 {
	static int[] dp;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			dp = new int[N+1];
			
			int ans = 1;
			dp[1] = Integer.parseInt(st.nextToken());
			for (int i = 1; i < N; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				
				if (dp[ans] <= tmp) dp[++ans] = tmp;
				else lower_bound(ans, tmp);
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static void lower_bound(int end, int n) {
		int start = 1;
		
		while(start < end) {
			int mid = (start+end)/2;
			
			if (dp[mid] >= n) end = mid;
			else start = mid+1;
		}
		
		dp[end] = n;
	}
}