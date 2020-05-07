/*
 * [D3] 8888. 시험
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8888 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken())+1;
			int T = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			boolean[][] sheet = new boolean[N+1][T];
			int[] wrong = new int[T];
			
			for (int i = 1; i < N; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				for (int j = 0; j < T; j++) {
					if (st.nextToken().equals("0")) wrong[j]++;
					else sheet[i][j] = true;
				}
			}
			
			int[][] score = new int[N][2];
			for (int i = 1; i < N; i++) {
				int total = 0, cnt = 0;
				for (int j = 0; j < T; j++) {
					if (sheet[i][j]) {
						total += wrong[j];
						cnt++;
					}
				}
				score[i][0] = total;
				score[i][1] = cnt;
			}
			
			int tmp = score[P][0], cnt = score[P][1], rank = 1;
			for (int i = 1; i < N; i++) {
				if (score[i][0] > tmp) rank++;
				else if (score[i][0] == tmp) {
					if (score[i][1] > cnt) rank++;
					else if (score[i][1] == cnt && i < P) rank++;
				}
			}
			
			sb.append("#"+t+" "+score[P][0]+" "+rank+"\n");
		}
		
		System.out.println(sb);
	}
}