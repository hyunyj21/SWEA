/*
 * [D3] 9997. 미니멀리즘 시계
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_9997 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int angle = Integer.parseInt(in.readLine()) * 2;
			sb.append("#").append(t).append(" ").append(angle/60).append(" ").append(angle%60).append("\n");
		}
		
		System.out.print(sb);
	}
}