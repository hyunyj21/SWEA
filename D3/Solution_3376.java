/*
 * [D3] 3376. 파도반 수열
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_3376 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		long[] ans = new long[101];
		ans[1] = 1; ans[2] = 1; ans[3] = 1; ans[4] = 2; ans[5] = 2;
		for (int i = 6; i < 101; i++)
			ans[i] = ans[i-1] + ans[i-5];
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			System.out.println("#"+t+" "+ans[N]);
		}
	}
}