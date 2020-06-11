/*
 * [D3] 4579. 세상의 모든 팰린드롬 2
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_4579 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			String word = in.readLine();
			
			char f, b;
			boolean check = true;
			int len = word.length();
			for (int i = 0, size = len/2; i < size; i++) {
				f = word.charAt(i);
				b = word.charAt(len-i-1);
				
				if (f=='*' || b =='*') break;
				if (f != b) {
					check = false;
					break;
				}
			}
			
			if (check) System.out.println("#"+t+" Exist");
			else System.out.println("#"+t+" Not exist");
		}
	}
}