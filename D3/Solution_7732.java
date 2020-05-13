/*
 * [D3] 7732. 시간 개념
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_7732 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int h = 0, m = 0, s = 0;
			
			for (int i = 0; i < 2; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine(), ":");
				h = Integer.parseInt(st.nextToken()) - h;
				m = Integer.parseInt(st.nextToken()) - m;
				s = Integer.parseInt(st.nextToken()) - s;
			}
			
			if (s < 0) {
				s += 60;
				m--;
			}
			
			if (m < 0) {
				m += 60;
				h--;
			}
			
			if (h < 0) h += 24;
			
			sb.append("#").append(t).append(" ");
			if (h < 10) sb.append("0");
			sb.append(h).append(":");
			
			if (m < 10) sb.append("0");
			sb.append(m).append(":");
			
			if (s < 10) sb.append("0");
			sb.append(s).append("\n");
		}
		
		System.out.println(sb);
	}
}