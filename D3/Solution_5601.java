/*
 * [D3] 5601. [Professional] 쥬스 나누기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_5601 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t);
			int N = Integer.parseInt(in.readLine());
			
			for (int i = 0; i < N; i++)
				sb.append(" 1/").append(N);
			
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}