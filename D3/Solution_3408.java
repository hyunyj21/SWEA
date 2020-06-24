/*
 * [D3] 3408. 세가지 합 구하기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_3408 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			long N = Long.parseLong(in.readLine());
			sb.append("#").append(t).append(" ").append((N*(N+1))/2).append(" ").append(N*N).append(" ").append(N*(N+1)).append("\n");
		}
		
		System.out.println(sb);
	}
}