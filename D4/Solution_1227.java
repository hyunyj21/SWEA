/*
 * [D4] 1227. [S/W 문제해결 기본] 7일차 - 미로2
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1227 {
	public static int ans, N = 100;
	public static boolean[][] maze;
	public static int[][] point;
	public static int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0,1}};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			in.readLine();
			maze = new boolean[N][N];
			point = new int[2][2];
			
			for (int i = 0; i < N; i++) {
				String tmp = in.readLine();
				for (int j = 0; j < N; j++) {
					if (tmp.charAt(j) == '1') continue;
					
					if (tmp.charAt(j) == '2') {
						point[0][0] = i;
						point[0][1] = j;
					} else if (tmp.charAt(j) == '3') {
						point[1][0] = i;
						point[1][1] = j;
					}
					
					maze[i][j] = true;
				}
			}
			
			ans = 0;
			dfs(point[0][0], point[0][1]);
			
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static void dfs(int r, int c) {
		if (r == point[1][0] && c == point[1][1]) {
			ans = 1;
			return;
		}
		
		if (ans == 1) return;
		
		maze[r][c] = false;
		
		for (int i = 0; i < 4; i++) {
			int nr = r + dir[i][0];
			int nc = c + dir[i][1];
			
			if (nr>-1 && nr<N && nc>-1 && nc<N && maze[nr][nc]) {
				dfs(nr, nc);
			}
		}
	}
}