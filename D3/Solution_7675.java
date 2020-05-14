/*
 * [D3] 7675. 통역사 성경이
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_7675 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t);
			in.readLine();
			String input = in.readLine();
			
			int cnt = 0, idx = 0;
			boolean first = true, other = true;
			for (int i = 0, len = input.length(); i < len; i++) {
				char tmp = input.charAt(i);
				
				if (tmp=='.' || tmp=='?' || tmp=='!' || tmp == ' ') {
					if (first && other) cnt++;
					else {
						first = true;
						other = true;
					}
					
					if (tmp == ' ') {
						idx = i+1;
						continue;
					}
					
					sb.append(" ").append(cnt);
					cnt = 0;
					idx = i+2;
					i+=1;
					continue;
				}
				
				if (i == idx) {
					if (tmp < 'A' || tmp > 'Z') first = false;
					idx = -1;
					continue;
				}
				
				if (first) {
					if (tmp < 'a' || tmp > 'z') other = false;
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}