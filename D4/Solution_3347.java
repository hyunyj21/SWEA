/*
 * [D4] 3347. 올림픽 종목 투표
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3347 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(in.readLine(), " ");
			int[] A = new int[N+1];
			
			for (int i = 1; i <= N; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(in.readLine(), " ");
			int[] cnt = new int[N+1];
			
			for (int i = 0; i < M; i++) {
				int B = Integer.parseInt(st.nextToken());
				
				for (int j = 1; j <= N; j++) {
					if (A[j] <= B) {
						cnt[j]++;
						break;
					}
				}
			}
			
			int ans = 0, max = 0;
			
			for (int i = 1; i <= N; i++) {
				if (cnt[i] > max) {
					ans = i;
					max = cnt[i];
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}