/*
 * [D3] 10912. 외로운 문자
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_10912 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			String word = in.readLine();
			boolean[] pair = new boolean[26];
			
			for (int i = 0, len = word.length(); i < len; i++) {
				int idx = word.charAt(i)-97;
				pair[idx] = !pair[idx];
			}
			
			sb.append("#").append(t).append(" ");
		
			boolean flag = false;
			for (int i = 0; i < 26; i++) {
				if (pair[i]) {
					sb.append((char)(i+97));
					flag = true;
				}
			}
			
			if (!flag) sb.append("Good");
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}