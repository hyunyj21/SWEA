/*
 * [D2] 1979. 어디에 단어가 들어갈 수 있을까
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1979 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			boolean[][] puzzle = new boolean[N][N];
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				for (int j = 0; j < N; j++) {
					if (st.nextToken().equals("1")) puzzle[i][j] = true;
				}
			}
			
			int ans = 0;
			for (int i = 0; i < N; i++) { //행
				for (int j = 0; j < N; j++) { //열
					if (j < N-1 && (j==0 || (j>0 && !puzzle[i][j-1])) && puzzle[i][j] && puzzle[i][j+1]) { //가로
						int k = j+2, cnt = 2;
						while (k<N && puzzle[i][k]) {
							cnt++;
							k++;
							if (cnt > K) break;
						}
						if (cnt == K) ans++;
					}
					
					if (i < N-1 && (i==0 || (i>0 && !puzzle[i-1][j])) && puzzle[i][j] && puzzle[i+1][j]) { //세로
						int k = i+2, cnt = 2;
						while (k<N && puzzle[k][j]) {
							cnt++;
							k++;
							if (cnt > K) break;
						}
						if (cnt == K) ans++;
					}
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}