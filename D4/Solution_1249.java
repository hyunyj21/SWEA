/*
 * [D4] 1249. [S/W 문제해결 응용] 4일차 - 보급로
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Solution_1249 {
	static int N, ans;
	static int[][] map, min;
	static int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			N = Integer.parseInt(in.readLine());
			map = new int[N][N];
			min = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				String tmp = in.readLine();
				
				for (int j = 0; j < N; j++) {
					map[i][j] = tmp.charAt(j) - '0';
					min[i][j] = Integer.MAX_VALUE;
				}
			}

			ans = Integer.MAX_VALUE;
			bfs();
			
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static void bfs() {
		LinkedList<int[]> q = new LinkedList<>();
		q.offer(new int[] {0,0,0});
		min[0][0] = 0;
		
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			int r = cur[0];
			int c = cur[1];
			int cnt = cur[2];
			
			if (r == N-1 && c == N-1) {
				ans = Math.min(ans, cnt);
				continue;
			}
			
			for (int i = 0; i < 4; i++) {
				int nr = r + dir[i][0];
				int nc = c + dir[i][1];
				
				if (nr>-1 && nr<N && nc>-1 && nc<N && (cnt+map[nr][nc] < min[nr][nc])) {
					q.offer(new int[] {nr, nc, cnt+map[nr][nc]});
					min[nr][nc] = cnt+map[nr][nc];
				}
			}
		}
	}
}