/*
 * [D4] 1249. [S/W 문제해결 응용] 4일차 - 보급로
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

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
		PriorityQueue<Point> q = new PriorityQueue<>();
		q.offer(new Point(0, 0, 0));
		min[0][0] = 0;
		
		while(!q.isEmpty()) {
			Point cur = q.poll();
			int r = cur.row;
			int c = cur.col;
			int cost = cur.cost;
			
			if (r == N-1 && c == N-1) {
				ans = Math.min(ans, cost);
				continue;
			}
			
			for (int i = 0; i < 4; i++) {
				int nr = r + dir[i][0];
				int nc = c + dir[i][1];
				
				if (nr>-1 && nr<N && nc>-1 && nc<N && (cost+map[nr][nc] < min[nr][nc])) {
					q.offer(new Point(nr, nc, cost+map[nr][nc]));
					min[nr][nc] = cost+map[nr][nc];
				}
			}
		}
	}
	
	public static class Point implements Comparable<Point> {
		int row;
		int col;
		int cost;
		
		public Point(int row, int col, int cost) {
			this.row = row;
			this.col = col;
			this.cost = cost;
		}

		@Override
		public int compareTo(Point o) {
			return this.cost - o.cost;
		}
	}
}