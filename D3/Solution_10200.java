/*
 * [D3] 10200. 구독자 전쟁
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_10200 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if (A > B) {
				int tmp = B-N+A > 0 ? B-N+A : 0;
				sb.append(B).append(" ").append(tmp);
			} else {
				int tmp = A-N+B > 0 ? A-N+B : 0;
				sb.append(A).append(" ").append(tmp);
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}