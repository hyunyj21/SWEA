/*
 * [D3] 2817. 부분 수열의 합
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2817 {
	static int N, K, tmp, ans;
	static int[] num;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(in.readLine(), " ");
			num = new int[N];
			
			for (int i = 0; i < N; i++)
				num[i] = Integer.parseInt(st.nextToken());
			
			tmp = 0;
			ans = 0;
			for (int i = 0; i < N; i++) {
				tmp++;
				combi(0,0,0);
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static void combi(int cnt, int start, int sum) {
		if (cnt < tmp && sum >= K) return;
		
		if (cnt == tmp) {
			if (sum == K) ans++;
			return;
		}
		
		for (int i = start; i < N; i++)
			combi(cnt+1, i+1, sum+num[i]);
	}
}