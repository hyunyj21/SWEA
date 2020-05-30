/*
 * [D3] 5688. 세제곱근을 찾아라
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_5688 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			long N = Long.parseLong(in.readLine());
			double ans = Math.cbrt(N);
			
			if (ans % 1 != 0) ans = -1;
			
			System.out.println("#"+t+" "+(int)ans);
		}
	}
}