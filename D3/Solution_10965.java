/*
 * [D3] 10965. 제곱수 만들기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_10965 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int num = Integer.parseInt(in.readLine());
			int tmp, ans = 1;
			
			do {
				tmp = num * ans;
				ans++;
			} while ((Math.sqrt(tmp) % 1) != 0.0);
			
			sb.append("#").append(t).append(" ").append(ans-1).append("\n");
		}
		
		System.out.print(sb);
	}
}