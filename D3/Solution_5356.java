/*
 * [D3] 5356. 의석이의 세로로 말해요
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_5356 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			Info[] word = new Info[5];

			int max = 0;
			for (int i = 0; i < 5; i++) {
				word[i] = new Info();
				word[i].toy = in.readLine();
				word[i].num = word[i].toy.length();
				
				if (word[i].num > max) max = word[i].num;
			}
			
			for (int i = 0; i < max; i++) {
				for (int j = 0; j < 5; j++) {
					if (word[j].num > i) sb.append(word[j].toy.charAt(i));
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static class Info {
		String toy;
		int num;
	}
}