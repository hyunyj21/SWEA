/*
 * [D3] 4615. 재미있는 오셀로 게임
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_4615 {
	static int N, M;
	static int[][] board;
	static int[][] dir = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			N = Integer.parseInt(st.nextToken())+1;
			M = Integer.parseInt(st.nextToken());
			board = new int[N][N];
			
			int a = (N-1)/2, b = a+1;
			board[a][b] = 1;
			board[b][a] = 1;
			board[a][a] = 2; 
			board[b][b] = 2;
			
			for (int i = 0; i < M; i++) {
				String input = in.readLine();
				int r = input.charAt(0) - '0';
				int c = input.charAt(2) - '0';
				int color = input.charAt(4) - '0';
				
				game(r, c, color);
			}
			
			a = 0; b= 0;
			for (int i = 1; i < N; i++) {
				for (int j = 1; j < N; j++) {
					if (board[i][j] == 0) continue;
					if (board[i][j] == 1) a++;
					else b++;
				}
			}
			
			System.out.println("#"+t+" "+a+" "+b);
		}
	}
	
	public static void game(int r, int c, int color) {
		board[r][c] = color;
		
		for (int i = 0; i < 8; i++) {
			int nr = r + dir[i][0];
			int nc = c + dir[i][1];
			
			if (nr>0 && nr<N && nc>0 && nc<N && board[nr][nc] != 0 && board[nr][nc] != color) {
				if (!check(i, nr, nc, color)) continue;
				change(i, nr, nc, color);
			}
		}
	}
	
	public static boolean check(int i, int r, int c, int color) {
		int nr = r, nc = c;
		do {
			if (board[nr][nc] == color) return true;
			nr += dir[i][0];
			nc += dir[i][1];
		} while (nr>0 && nr<N && nc>0 && nc<N && board[nr][nc] != 0);
		
		return false;
	}
	
	public static void change(int i, int r, int c, int color) {
		int nr = r, nc = c;
		do {
			board[nr][nc] = color;
			
			nr += dir[i][0];
			nc += dir[i][1];
		} while (board[nr][nc] != color);
	}
}