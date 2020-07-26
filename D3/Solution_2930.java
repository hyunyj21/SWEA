/*
 * [D3] 2930. 힙
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution_2930 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t);
			int N = Integer.parseInt(in.readLine());
			PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				
				if (st.nextToken().equals("1")) q.offer(Integer.parseInt(st.nextToken()));
				else {
					if (q.size() == 0) sb.append(" -1");
					else sb.append(" ").append(q.poll());
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}