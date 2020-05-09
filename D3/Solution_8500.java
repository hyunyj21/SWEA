/*
 * [D3] 8500. 극장 좌석
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8500 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			
			int ans = 0, max = Integer.MIN_VALUE;
			for (int i = 0; i < N; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				ans += tmp;
				max = Math.max(max, tmp);
			}
			
			System.out.println("#"+t+" "+(ans+N+max));
		}
	}
}