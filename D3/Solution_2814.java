/*
 * [D3] 2814. 최장 경로
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_2814 {
	static List<List<Integer>> graph;
	static boolean[] visited;
	static int ans;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			graph = new ArrayList<>();
			
			for (int i = 0; i <= N; i++) {
				graph.add(new ArrayList<Integer>());
			}
			
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				graph.get(x).add(y);
				graph.get(y).add(x);
			}
			
			ans = 0;
			visited = new boolean[N+1];
			for (int i = 1; i <= N; i++) {
				if (ans == N) break;
				dfs(i, 1);
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static void dfs(int start, int cnt) {
		visited[start] = true;
		
		List<Integer> nextList = graph.get(start);
		for (int i = 0, len = nextList.size(); i < len; i++) {
			int next = nextList.get(i);
			
			if (visited[next]) continue;
			
			dfs(next, cnt+1);
			visited[next] = false;
		}
		
		visited[start] = false;
		ans = Math.max(ans, cnt);
	}
}