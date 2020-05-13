/*
 * [D3] 7853. 오타
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_7853 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			String word = in.readLine();
			
			long ans = 1;
			for (int i = 0, len = word.length(); i < len; i++) {
				if (i == 0) {
					if (word.charAt(0) != word.charAt(1)) ans *= 2;
					continue;
				}
				
				if (i == len-1) {
					if (word.charAt(i-1) != word.charAt(i)) ans = (ans * 2) % 1000000007;
					continue;
				}
				
				int cnt = 3;
				char t1 = word.charAt(i-1), t2 = word.charAt(i), t3 = word.charAt(i+1);
				if (t1 == t2) cnt--;
				if (t1 == t3) cnt--;
				if (t2 == t3) cnt--;
				
				if (cnt == 0) continue;
				ans = (ans * cnt) % 1000000007;
			}
			
			sb.append("#").append(t).append(" ").append(ans).append("\n");
		}
		
		System.out.println(sb);
	}
}