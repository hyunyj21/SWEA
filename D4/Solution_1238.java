/*
 * [D4] 1238. [S/W 문제해결 기본] 10일차 - Contact
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
			visited[start] = true;
			
			bfs(start);
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static void bfs(int start) {
		LinkedList<int[]> q = new LinkedList<>();
		ArrayList<Integer> tmp = graph.get(start);
		
		for (int i = 0, len = tmp.size(); i < len; i++) {
			int num = tmp.get(i);
			
			if (visited[num]) continue;
			
			q.offer(new int[] {num, 1});
			visited[num] = true;
		}
		
		while (!q.isEmpty()) {
			
		}
	}
}