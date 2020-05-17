/*
 * [D3] 7532. 세영이의 SEM력 연도
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_7532 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int ans = S;
			while(true) {
				if ((ans%24==E || (E==24 && ans%24==0)) && (ans%29==M || (M==29 && ans%29==0))) break;
				ans += 365;
			}
			
			sb.append("#").append(t).append(" ").append(ans).append("\n");
		}
		
		System.out.println(sb);
	}
}