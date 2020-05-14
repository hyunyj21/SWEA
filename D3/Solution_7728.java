/*
 * [D3] 7728. 다양성 측정
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_7728 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			String num = in.readLine();
			boolean[] check = new boolean[10];
			
			int ans = 0;
			for (int i = 0, len = num.length(); i < len; i++) {
				if (ans == 10) break;
				
				int tmp = num.charAt(i)-48;
				if (!check[tmp]) {
					check[tmp] = true;
					ans++;
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}