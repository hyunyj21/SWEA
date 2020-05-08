/*
 * [D3] 8658. Summation
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8658 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t);
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			
			int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
			for (int i = 0; i < 10; i++) {
				int num = Integer.parseInt(st.nextToken());
				
				int sum = 0;
				while (num != 0) {
					sum += num%10;
					num = num/10;
				}
				
				max = Math.max(max, sum);
				min = Math.min(min, sum);
			}
			
			sb.append(" ").append(max).append(" ").append(min).append("\n");
		}
		
		System.out.println(sb);
	}
}