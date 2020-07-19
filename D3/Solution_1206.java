/*
 * [D3] 1206. [S/W 문제해결 기본] 1일차 - View
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1206 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			int N = Integer.parseInt(in.readLine()) + 2;
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int[] building = new int[N+2];
			
			for (int i = 2; i < N; i++)
				building[i] = Integer.parseInt(st.nextToken());
			
			int ans = 0, left, right, now;
			for (int i = 2; i < N; i++) {
				now = building[i];
				left = Math.max(building[i-2], building[i-1]);
				right = Math.max(building[i+1], building[i+2]);
				
				if (left >= now || right >= now) continue;
				
				if (left > right) ans += now - left;
				else ans += now - right;
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}