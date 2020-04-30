/*
 * [D2] 2001. 파리 퇴치
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2001 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[][] fly = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				
				for (int j = 0; j < N; j++)
					fly[i][j] = Integer.parseInt(st.nextToken());
			}
			
			int cnt = N-M+1, tmp = 0, max = 0;
			int[][] memo = new int[N][cnt];
			for (int i = 0; i < cnt; i++) { //전체
				for (int j = 0; j < cnt; j++) { //열
					for (int k = i, len = i+M; k < len; k++) { //행
						if (memo[k][j] == 0) {
							for (int l = j, leng = j+M; l < leng; l++)
								memo[k][j] += fly[k][l];
						}
						tmp += memo[k][j];
					}
					max = Math.max(max, tmp);
					tmp = 0;
				}
			}
			
			System.out.println("#"+t+" "+max);
		}
	}
}