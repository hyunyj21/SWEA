/*
 * [D3] 7272. 안경이 없어!
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_7272 {
	static int[] num = {1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			String w1 = st.nextToken();
			String w2 = st.nextToken();
			
			int len = w1.length();
			if (len != w2.length()) {
				sb.append("DIFF").append("\n");
				continue;
			}
			
			boolean check = true;
			for (int i = 0; i < len; i++) {
				if (num[w1.charAt(i)-'A'] != num[w2.charAt(i)-'A']) {
					check = false;
					break;
				}
			}
			
			if (check) sb.append("SAME").append("\n");
			else sb.append("DIFF").append("\n");
		}
		
		System.out.println(sb);
	}
}