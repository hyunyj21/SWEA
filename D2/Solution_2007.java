/*
 * [D2] 2007. 패턴 마디의 길이
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			String word = in.readLine();
			int ans = 0;
			
			for (int i = 2, len = word.length(); i < len; i++) {
				if (word.substring(0, i).equals(word.substring(i, i+i))) {
					ans = i;
					break;
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}