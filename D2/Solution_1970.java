/*
 * [D2] 1970. 쉬운 거스름돈
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1970 {
	static int[] kind = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append("\n");
			int money = Integer.parseInt(in.readLine());
			
			int idx = 0;
			while(money >= 10) {
				sb.append(money/kind[idx]).append(" ");
				money %= kind[idx];
				idx++;
			}
			
			for (int i = idx; i < 8; i++)
				sb.append("0").append(" ");
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}