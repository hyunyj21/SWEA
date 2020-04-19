/*
 * [D1] 2070. 큰 놈, 작은 놈, 같은 놈
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2070 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int sub = Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken());
			sb.append("#"+t+" ");
			
			if (sub > 0) sb.append(">\n");
			else if (sub == 0) sb.append("=\n");
			else sb.append("<\n");
		}
		
		System.out.println(sb);
	}
}