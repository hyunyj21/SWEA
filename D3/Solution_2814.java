/*
 * [D3] 2814. 최장 경로
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_2814 {
	static int N;
	static int[] parent, depth, cnt;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			N = Integer.parseInt(st.nextToken()) + 1;
			int M = Integer.parseInt(st.nextToken());
			
			if (M == 0 || M == 1) {
				sb.append(M+1).append("\n");
				continue;
			}
			
			parent = new int[N];
			depth = new int[N];
			cnt = new int[N];
			for (int i = 1; i < N; i++)
				parent[i] = i;
			
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				union(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			}
			
			Arrays.sort(cnt);
			sb.append(cnt[N-1]+1).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static int findSet(int v) {
		if (parent[v] == v) return v;
		
		parent[v] = findSet(parent[v]);
		return parent[v];
	}
	
	public static void union(int u, int v) {
		u = findSet(u);
		v = findSet(v);
		
		if (depth[u] > depth[v]) {
			parent[v] = u;
			cnt[u] += cnt[v] + 1;
		} else {
			parent[u] = v;
			cnt[v] += cnt[u] + 1;
		}
		
		if (depth[u] == depth[v]) depth[v]++;
	}
}