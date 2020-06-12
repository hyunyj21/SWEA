/*
 * [D3] 3975. 승률 비교하기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3975 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t);
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken()) * B;
			int D = Integer.parseInt(st.nextToken()) * A;
			
			if (C < D) sb.append(" ALICE\n");
			else if (C > D) sb.append(" BOB\n");
			else sb.append(" DRAW\n");
		}
		
		System.out.println(sb);
	}
}