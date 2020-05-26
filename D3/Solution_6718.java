/*
 * [D3] 6718. 희성이의 원근법
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_6718 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			String d = in.readLine();
			int len = d.length() - 2;

			if (len < 1) sb.append("0");
			else if (len > 4) sb.append("5");
			else sb.append(len);
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}