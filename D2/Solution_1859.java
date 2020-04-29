/*
 * [D2] 1859. 백만 장자 프로젝트
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1859 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			Integer[] price = new Integer[N+1];
			
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			for (int i = 1; i <= N; i++)
				price[i] = Integer.parseInt(st.nextToken());
			
			long ans = 0;
			int max = Integer.MIN_VALUE;
			for (int i = N; i > 0; i--) {
				if (price[i] > max) max = price[i];
				else ans += max-price[i];
			}

			sb.append("#").append(t).append(" ").append(ans).append("\n");
		}
		System.out.println(sb);
	}
}