/*
 * [D2] 1989. 초심자의 회문 검사
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1989 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			String word = in.readLine();
			int N = word.length();
			
			int ans = 1;
			for (int i = 0, len = N/2; i < len; i++) {
				if (word.charAt(i) != word.charAt(N-i-1)) {
					ans = 0;
					break;
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}