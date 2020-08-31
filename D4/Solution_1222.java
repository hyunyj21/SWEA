/*
 * [D4] 1222. [S/W 문제해결 기본] 6일차 - 계산기1
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1222 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			in.readLine();
			StringTokenizer st = new StringTokenizer(in.readLine(), "+");
			
			int ans = 0;
			while(st.hasMoreTokens()) {
				ans += Integer.parseInt(st.nextToken());
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}