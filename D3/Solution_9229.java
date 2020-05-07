/*
 * [D3] 9229. 한빈이와 Spot Mart
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_9229 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[] weight = new int[N];
			int ans = -1;
			
			st = new StringTokenizer(in.readLine(), " ");
			for (int i = 0; i < N; i++) weight[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(weight);
			
			for (int i = N-1; i > -1; i--) {
				int left = M - weight[i];
				
				for (int j = i-1; j > -1; j--) {
					if (weight[j] <= left) {
						ans = Math.max(ans, weight[i]+weight[j]);
						break;
					}
				}
				
				if (ans == M) break;
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}