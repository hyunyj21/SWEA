/*
 * [D3] 5515. 2016년 요일 맞추기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_5515 {
	public static int[] day = {0,31,29,31,30,31,30,31,31,30,31,30,31};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int m = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			for (int i = 1; i < m; i++)
				d += day[i];
			
			int ans = d % 7;
			if (ans < 4) ans += 3;
			else ans -= 4;
			
			System.out.println("#"+t+" "+ans);
		}
	}
}