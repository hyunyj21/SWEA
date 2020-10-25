/*
 * [D3] 1216. [S/W 문제해결 기본] 3일차 - 회문2
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1216 {
	static int N = 100;
	static char[][] board;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			in.readLine();
			board = new char[N][N];
			
			for (int i = 0; i < N; i++) {
				String tmp = in.readLine();
				
				for (int j = 0; j < N; j++) {
					board[i][j] = tmp.charAt(j);
				}
			}
			
			int ans = 0;
			for (int i = N; i > 0; i--) {
				if (solve(i)) {
					ans = i;
					break;
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static boolean solve(int cnt) {
		int len = N-cnt+1, size = cnt/2;
		boolean row, col;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < len; j++) {
				row = true;
				col = true;
				
				for (int k = 0; k < size; k++) {
					if (!row && !col) break;
					if (row && board[i][j+k] != board[i][j+cnt-1-k]) row = false;
					if (col && board[j+k][i] != board[j+cnt-1-k][i]) col = false;
				}
				
				if (row || col) return true;
			}
		}
		
		return false;
	}
}