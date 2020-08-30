/*
 * [D3] 2806. N-Queen
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_2806 {
	static int N, ans;
	static int[] col;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			N = Integer.parseInt(in.readLine());
			col = new int[N];
			
			ans = 0;
			dfs(0);
			
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static void dfs(int cnt) {
		if (cnt == N) {
			ans++;
			return;
		}
		
		for (int i = 0; i < N; i++) {
			col[cnt] = i;
			
			if (check(cnt)) dfs(cnt+1);
		}
	}
	
	public static boolean check(int cnt) {
		for (int i = 0; i < cnt; i++) {
			if (col[i] == col[cnt]) return false;
			else if (Math.abs(i-cnt) == Math.abs(col[i]-col[cnt])) return false;
		}
		
		return true;
	}
}