/*
 * [D3] 2930. 힙
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_2930 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t);
			int N = Integer.parseInt(in.readLine());
			LinkedList<Integer> num = new LinkedList<>();
			boolean check = true;
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				
				if (st.nextToken().equals("1")) {
					num.offer(Integer.parseInt(st.nextToken()));
					check = false;
				} else {
					if (num.size() == 0) {
						sb.append(" -1");
						continue;
					}
					
					if (!check) {
						Collections.sort(num);
						Collections.reverse(num);
						check = true;
					}
					sb.append(" ").append(num.poll());
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}