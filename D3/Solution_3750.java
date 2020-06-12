/*
 * [D3] 3750. Digit sum
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_3750 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			String num = in.readLine();
			
			if (num.length() == 1) {
				sb.append(num.charAt(0)-'0').append("\n");
				continue;
			}
			
			int ans;
			do {
				ans = 0;
				for (int i = 0, len = num.length(); i < len; i++) 
					ans += num.charAt(i) - '0';
				
				num = Integer.toString(ans);
			} while (ans > 9);
			
			sb.append(ans).append("\n");
		}
		
		System.out.println(sb);
	}
}
