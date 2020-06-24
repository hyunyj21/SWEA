/*
 * [D3] 10059. 유효기간
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_10059 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			String date = in.readLine();
			
			boolean c1 = false, c2 = false;
			int first = Integer.parseInt(date.substring(0, 2));
			int second = Integer.parseInt(date.substring(2, 4));
			
			if (first>0 && first<13) c1 = true;
			if (second>0 && second<13) c2 = true;
			
			if (c1 && c2) sb.append("AMBIGUOUS");
			else if (c1) sb.append("MMYY");
			else if (c2) sb.append("YYMM");
			else sb.append("NA");
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}