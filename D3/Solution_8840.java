/*
 * [D3] 8840. 아바바바
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8840 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			long L = Long.parseLong(in.readLine())/2;
			sb.append("#"+t+" "+L*L+"\n");
		}
		
		System.out.println(sb);
	}
}