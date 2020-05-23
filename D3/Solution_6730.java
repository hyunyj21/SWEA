/*
 * [D3] 6730. 장애물 경주 난이도
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_6730 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			in.readLine();
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken()), up = 0, down = 0;
			while(st.hasMoreTokens()) {
				int b = Integer.parseInt(st.nextToken());
				
				if (a < b) up = Math.max(up, b-a);
				else down = Math.max(down, a-b);
				
				a = b;
			}
			
			System.out.println("#"+t+" "+up+" "+down);
		}
	}
}