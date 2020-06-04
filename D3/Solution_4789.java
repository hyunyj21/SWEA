/*
 * [D3] 4789. 성공적인 공연 기획
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_4789 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			String clap = in.readLine();
			
			int cnt = 0, ans = 0;
			for (int i = 0, len = clap.length(); i < len; i++) {
				if (cnt+ans < i) ans++;
				cnt += clap.charAt(i) - '0';
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}