/*
 * [D4] 1232. [S/W 문제해결 기본] 9일차 - 사칙연산
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1232 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			int N = Integer.parseInt(in.readLine());
			int[][] tree = new int[N+1][3];
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine());
				int idx = Integer.parseInt(st.nextToken());
				String numOrOperator = st.nextToken();
				int tmp = numOrOperator.charAt(0)-'0';
				
				if (tmp < 0) {
					tree[idx][0] = tmp;
					tree[idx][1] = Integer.parseInt(st.nextToken());
					tree[idx][2] = Integer.parseInt(st.nextToken());
					
					continue;
				}
				
				tree[idx][0] = Integer.parseInt(numOrOperator);				
			}
			
			for (int i = N; i > 0; i--) {
				if (tree[i][0] > 0) continue;
				
				switch (tree[i][0]) {
				case -5:
					tree[i][0] = tree[tree[i][1]][0] + tree[tree[i][2]][0];
					break;
				case -3:
					tree[i][0] = tree[tree[i][1]][0] - tree[tree[i][2]][0];
					break;
				case -6:
					tree[i][0] = tree[tree[i][1]][0] * tree[tree[i][2]][0];
					break;
				case -1:
					tree[i][0] = tree[tree[i][1]][0] / tree[tree[i][2]][0];
					break;
				}
			}
			
			System.out.println("#"+t+" "+tree[1][0]);
		}
	}
}