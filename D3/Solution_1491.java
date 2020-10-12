/*
 * [D3] 1491. 원재의 벽 꾸미기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1491 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			long N = Long.parseLong(st.nextToken());
			long A = Long.parseLong(st.nextToken());
			long B = Long.parseLong(st.nextToken());
			
			long ans = Long.MAX_VALUE;
			for (int c = 1; c <= N; c++) {
				long r = N/c;
				
				if (r < c) break;
				
				long result1 = B*(N-c*c);
				long result2 = A*(r-c) + B*(N-r*c);
				
				if (result1 > result2) ans = Math.min(ans, result2);
				else ans = Math.min(ans, result1);
			}
			
			sb.append("#").append(t).append(" ").append(ans).append("\n");
		}
		
		System.out.print(sb);
	}
}