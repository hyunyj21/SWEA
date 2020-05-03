/*
 * [D2] 1959. 두 개의 숫자열
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[] A = new int[N];
			int[] B = new int[M];
			
			st = new StringTokenizer(in.readLine(), " ");
			for (int i = 0; i < N; i++)
				A[i] = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(in.readLine(), " ");
			for (int i = 0; i < M; i++)
				B[i] = Integer.parseInt(st.nextToken());
			
			int ans = 0;
			if (N > M) ans = calc(B, A, N-M+1);
			else ans = calc(A, B, M-N+1);
			
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static int calc(int[] A, int[] B, int cnt) {
		int max = 0;
		
		for (int i = 0; i < cnt; i++) {
			int tmp = 0;
			
			for (int j = 0, len = A.length; j < len; j++)
				tmp += A[j] * B[i+j];
			
			max = Math.max(max, tmp);
		}
		
		return max;
	}
}