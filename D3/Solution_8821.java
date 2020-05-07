/*
 * [D3] 8821. 적고 지우기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8821 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			String num = in.readLine();
			boolean[] note = new boolean[10];
			
			for (int i = 0, len = num.length(); i < len; i++) {
				int tmp = num.charAt(i) - 48;
				
				if (note[tmp]) note[tmp] = false;
				else note[tmp] = true;
			}
			
			int ans = 0;
			for (int i = 0, len = note.length; i < len; i++) {
				if (note[i]) ans++;
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}