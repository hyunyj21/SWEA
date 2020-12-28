/*
 * [D4] 3143. 가장 빠른 문자열 타이핑
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3143 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			String A = st.nextToken();
			String B = st.nextToken();
			
			int aLen = A.length();
			int bLen = B.length();
			int ans = 0, idx = 0;
			
			while (true) {
				if (idx >= aLen) break;
				if (idx <= aLen-bLen && A.substring(idx, idx+bLen).equals(B)) idx += bLen;
				else idx++;
				
				ans++;
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}