/*
 * [TEST] 1953. [모의 SW 역량테스트] 탈주범 검거
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_1953 {
	static int N, M, R, C, L, ans;
	static int[][] map;
	static boolean[][] visited;
	static int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0,1}};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());
			map = new int[N][M];
			visited = new boolean[N][M];
			
			for (int i = 0; i < N; i++) {
				String tmp = in.readLine();
				for (int j = 0; j < M; j++) {
					int num = tmp.charAt(j*2) - '0';
					
					if (num == 0) visited[i][j] = true;
					map[i][j] = num;
				}
			}
			
			ans = 1;
			bfs();
			
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static void bfs() {
		LinkedList<int[]> q = new LinkedList<>();
		q.offer(new int[] {R, C, 1});
		visited[R][C] = true;
		
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			int r = cur[0];
			int c = cur[1];
			int cnt = cur[2];
			
			if (cnt == L) return;
			
			for (int i = 0; i < 4; i++) {
				int nr = r + dir[i][0];
				int nc = c + dir[i][1];
				
				if (nr>-1 && nr<N && nc>-1 && nc<M && !visited[nr][nc] && check(map[r][c], i, map[nr][nc])) {
					q.offer(new int[] {nr, nc, cnt+1});
					visited[nr][nc] = true;
					ans++;
				}
			}
		}
	}
	
	public static boolean check(int cur, int dir, int next) {
		switch (dir) {
			case 0:
				if (exist(1, cur) && exist(0, next)) return true;
				break;
			case 1:
				if (exist(0, cur) && exist(1, next)) return true;
				break;
			case 2:
				if (exist(3, cur) && exist(2, next)) return true;
				break;
			case 3:
				if (exist(2, cur) && exist(3, next)) return true;
				break;
		}
		
		return false;
	}
	
	public static boolean exist(int n, int p) {
		switch (n) {
			case 0:
				if (p==1 || p==2 || p==5 || p==6) return true;
				break;
			case 1:
				if (p==1 || p==2 || p==4 || p==7) return true;
				break;
			case 2:
				if (p==1 || p==3 || p==4 || p==5) return true;
				break;
			case 3:
				if (p==1 || p==3 || p==6 || p==7) return true;
				break;
		}
		
		return false;
	}
}