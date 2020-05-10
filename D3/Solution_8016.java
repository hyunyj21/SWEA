/*
 * [D3] 8016. 홀수 피라미드
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8016 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			long N = Long.parseLong(in.readLine());
			
			sb.append(2*N*(N-1)-2*(N-1)+1).append(" ").append(2*N*(N-1)+2*(N-1)+1).append("\n");
		}
		
		System.out.println(sb);
	}
}