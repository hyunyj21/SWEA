/*
 * [D3] 8457. 알 덴테 스파게티
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8457 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			
			int min = B-E, max = B+E, ans = 0;
			st = new StringTokenizer(in.readLine(), " ");
			for (int i = 0; i < N; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				
				if (tmp > max) continue;
				
				int cal = tmp * ((min-1)/tmp+1);
				if (cal >= min && cal <= max) ans++;
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}