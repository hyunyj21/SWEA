/*
 * [D3] 9280. 진용이네 주차타워
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_9280 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int[] R = new int[n+1];
			int[] W = new int[m+1];
			boolean[] ispark = new boolean[n+1];
			
			for (int i = 1; i <= n; i++) R[i] = Integer.parseInt(in.readLine());
			for (int i = 1; i <= m; i++) W[i] = Integer.parseInt(in.readLine());
			
			int min = 1, cnt = 0;
			LinkedList<Integer> q = new LinkedList<>();
			HashMap<Integer, Integer> map = new HashMap<>();
			for (int i = 0, len = 2*m; i < len; i++) {
				int tmp = Integer.parseInt(in.readLine());
				
				if (cnt == n && tmp > 0) {
					q.offer(tmp);
					continue;
				}
				
				if (tmp > 0) {
					while (ispark[min]) {
						min++;
					}
					
					map.put(tmp, min);
					ispark[min] = true;
					min++;
					cnt++;
				} else {
					int num = map.get(Math.abs(tmp));
					
					if (!q.isEmpty()) {
						map.put(q.poll(), num);
						continue;
					}
					
					ispark[num] = false;
					min = Math.min(num, min);
					cnt--;
				}
			}
			
			int ans = 0;
			for (int key : map.keySet())
				ans += W[key] * R[map.get(key)];
			
			System.out.println("#"+t+" "+ans);
		}
	}
}