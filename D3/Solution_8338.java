/*
 * [D3] 8338. 계산기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8338 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			
			int ans = Integer.parseInt(st.nextToken()), b = 0;
			for (int i = 1; i < N; i++) {
				b = Integer.parseInt(st.nextToken());
				
				if (ans==0 || ans==1 || b==0 || b==1) ans += b;
				else ans *= b;
			}
			
			sb.append("#").append(t).append(" ").append(ans).append("\n");
		}
		
		System.out.println(sb);
	}
}