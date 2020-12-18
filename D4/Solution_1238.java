/*
 * [D4] 1238. [S/W 문제해결 기본] 10일차 - Contact
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_1238 {
	static int ans;
	static HashMap<Integer, ArrayList<Integer>> graph;
	static boolean[] visited;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			st.nextToken();
			int start = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(in.readLine());
			graph = new HashMap<>();
			
			while (st.hasMoreTokens()) {
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				ArrayList<Integer> tmp = new ArrayList<>();
				
				if (graph.containsKey(from)) tmp = graph.get(from);
				
				tmp.add(to);
				graph.put(from, tmp);
			}
			
			ans = 0;
			visited = new boolean[101];
			
			bfs(start);
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static void bfs(int start) {
		LinkedList<int[]> q = new LinkedList<>();
		
		q.offer(new int[] {start, 1});
		visited[start] = true;
		
		ArrayList<ArrayList<Integer>> cntAll = new ArrayList<>();
		for (int i = 0; i < 101; i++) {
			cntAll.add(new ArrayList<>());
		}

		int max = 1;
		
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int n = cur[0];
			int cnt = cur[1];
			
			if (cnt > max) max = cnt;
			cntAll.get(cnt).add(n);
			
			ArrayList<Integer> tmp = graph.get(n);
			if (tmp == null) continue;
			
			for (int i = 0, len = tmp.size(); i < len; i++) {
				int num = tmp.get(i);
				
				if (visited[num]) continue;
				
				q.offer(new int[] {num, cnt+1});
				visited[num] = true;
			}
		}
		
		cntAll.get(max).sort(Collections.reverseOrder());
		ans = cntAll.get(max).get(0);
	}
}