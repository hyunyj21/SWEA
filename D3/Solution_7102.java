/*
 * [D3] 7102. 준홍이의 카드놀이
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_7102 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			if (N == M) {
				sb.append((M+N)/2+1).append("\n");
				continue;
			}
			
			int cnt = (Math.abs(N-M))+1, start = (M+N+3-cnt)/2;
			for (int i = 0; i < cnt; i++)
				sb.append(start+i).append(" ");
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}