/*
 * [D3] 1213. [S/W 문제해결 기본] 3일차 - String
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1213 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			in.readLine();
			String word = in.readLine();
			String input = in.readLine();
			
			int ans = 0, idx = -1;
			while(true) {
				idx = input.indexOf(word, idx+1);
				
				if (idx == -1) break;
				ans++;
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}