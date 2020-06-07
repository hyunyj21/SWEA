/*
 * [D3] 4406. 모음이 보이지 않는 사람
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_4406 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			String word = in.readLine();
			
			for (int i = 0, len = word.length(); i < len; i++) {
				char tmp = word.charAt(i);
				
				if (tmp=='a' || tmp=='e' || tmp=='i' || tmp=='o' || tmp=='u') continue;
				sb.append(tmp);
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}