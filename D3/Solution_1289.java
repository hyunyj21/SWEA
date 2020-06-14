/*
 * [D3] 1289. 원재의 메모리 복구하기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1289 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			String memory = in.readLine();
			
			int ans = 0;
			char now = '0';
			for (int i = 0, len = memory.length(); i < len; i++) {
				if (memory.charAt(i) != now) {
					ans++;
					now = memory.charAt(i);
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}