/*
 * [D3] 10570. 제곱 팰린드롬 수
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_10570 {
	static int[] num = {1, 4, 9, 121, 484};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int ans = 0;
			for (int i = 0; i < 5; i++) {
				if (num[i] >= A && num[i] <= B) ans++;
			}
			
			sb.append("#").append(t).append(" ").append(ans).append("\n");
		}
		
		System.out.print(sb);
	}
}