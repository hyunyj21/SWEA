/*
 * [D3] 4522. 세상의 모든 팰린드롬
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_4522 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			String word = in.readLine();
			
			char f, b;
			boolean check = true;
			int len = word.length();
			for (int i = 0, size = len/2; i < size; i++) {
				f = word.charAt(i);
				b = word.charAt(len-i-1);
				
				if (f == '?' || b == '?') continue;
				if (f != b) {
					check = false;
					break;
				}
			}
			
			if (!check) sb.append("Not exist");
			else sb.append("Exist");
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}