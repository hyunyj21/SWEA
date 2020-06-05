/*
 * [D3] 4751. 다솔이의 다이아몬드 장식
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_4751 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			String word = in.readLine();
			int len = word.length();
			
			String ans[] = new String[3];
			ans[0] = ".";
			ans[1] = ".";
			ans[2] = "#";
			for (int i = 0; i < len; i++) {
				ans[0] += ".#..";
				ans[1] += "#.#.";
				ans[2] += "."+word.charAt(i)+".#";
			}
			
			sb.append(ans[0]).append("\n");
			sb.append(ans[1]).append("\n");
			sb.append(ans[2]).append("\n");
			sb.append(ans[1]).append("\n");
			sb.append(ans[0]).append("\n");
		}
		
		System.out.println(sb);
	}
}