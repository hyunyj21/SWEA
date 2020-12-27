/*
 * [D4] 5432. 쇠막대기 자르기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_5432 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			String tmp = in.readLine();
			int ans = 0, left = 0;
			boolean flag = false;
			
			for (int i = 0, len = tmp.length(); i < len; i++) {
				if (tmp.charAt(i) == '(') {
					left++;
					flag = true;
					continue;
				}
				
				if (flag) {
					ans += --left;
					flag = false;
				} else {
					left--;
					ans++;
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}