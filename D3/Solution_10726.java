/*
 * [D3] 10726. 이진수 표현
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_10726 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			String M = Integer.toBinaryString(Integer.parseInt(st.nextToken()));
			
			boolean ans = true;
			if (M.length() < N) ans = false;
			
			if (ans) {
				for (int i = M.length()-1,len = M.length()-1-N; i > len; i--) {
					if (M.charAt(i) != '1') {
						ans = false;
						break;
					}
				}
			}
			
			sb.append("#").append(t).append(" ");
			if (ans) sb.append("ON");
			else sb.append("OFF");
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}