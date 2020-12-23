/*
 * [D3] 11285. 다트 게임
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_11285 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			int ans = 0;
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				double len = Math.sqrt(x*x + y*y);
				
				if (len <= 20) ans += 10;
				else if (len > 20 && len <= 40) ans += 9;
				else if (len > 40 && len <= 60) ans += 8;
				else if (len > 60 && len <= 80) ans += 7;
				else if (len > 80 && len <= 100) ans += 6;
				else if (len > 100 && len <= 120) ans += 5;
				else if (len > 120 && len <= 140) ans += 4;
				else if (len > 140 && len <= 160) ans += 3;
				else if (len > 160 && len <= 180) ans += 2;
				else if (len > 180 && len <= 200) ans += 1;
			}
			
			sb.append("#").append(t).append(" ").append(ans).append("\n");
		}
		
		System.out.print(sb);
	}
}