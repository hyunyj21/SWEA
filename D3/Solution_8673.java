/*
 * [D3] 8673. 코딩 토너먼트1
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_8673 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int K = Integer.parseInt(in.readLine());
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			LinkedList<Integer> q = new LinkedList<>();
			
			for (int i = 0, len = (int) Math.pow(2, K); i < len; i++)
				q.offer(Integer.parseInt(st.nextToken()));
			
			int ans = 0;
			while(q.size() != 1) {
				int a = q.poll();
				int b = q.poll();
				
				if (a > b) {
					ans += a-b;
					q.offer(a);
				} else {
					ans += b-a;
					q.offer(b);
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}