/*
 * [D3] 4466. 최대 성적표 만들기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_4466 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[] score = new int[N];
			
			st = new StringTokenizer(in.readLine(), " ");
			for (int i = 0; i < N; i++)
				score[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(score);
			
			int ans = 0;
			for (int i = 0, idx = N-i-1; i < K; i++)
				ans += score[idx--];
			
			System.out.println("#"+t+" "+ans);
		}
	}
}