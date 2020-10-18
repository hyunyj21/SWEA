/*
 * [D3] 1220. [S/W 문제해결 기본] 5일차 - Magnetic
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1220 {
	static int N, ans;
	static String[][] board;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			N = Integer.parseInt(in.readLine());
			board = new String[N][N];
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				
				for (int j = 0; j < N; j++) {
					board[i][j] = st.nextToken();
				}
			}

			move("1", 1, N-1);
			move("2",-1, 0);
			
			ans = 0;
			count();
			
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static void move(String target, int dir, int fin) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!board[i][j].equals(target)) continue;
				
				board[i][j] = "0";
				
				int nr = i;
				
				if (fin == 0) {
					while (nr > fin && board[nr][j].equals("0")) {
						nr += dir;
					}
				} else {
					while (nr < fin && board[nr][j].equals("0")) {
						nr += dir;
					}
				}
				
				if (nr == fin && board[nr][j].equals("0")) continue;
				
				board[nr-dir][j] = target;
			}
		}
	}
	
	public static void count() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (board[i][j].equals("1") && board[i+1][j].equals("2")) ans++;
			}
		}
	}
}