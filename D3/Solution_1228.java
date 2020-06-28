/*
 * [D3] 1228. [S/W 문제해결 기본] 8일차 - 암호문1
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_1228 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for (int t = 1; t <= 10; t++) {
			in.readLine();
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			LinkedList<String> num = new LinkedList<>();
			
			for (int i = 0; i < 10; i++)
				num.offer(st.nextToken());
			
			in.readLine();
			st = new StringTokenizer(in.readLine(), " ");
			while(st.hasMoreTokens()) {
				st.nextToken();
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken()) + x;
				
				for (int i = x; i < y; i++) {
					if (i > 9) st.nextToken();
					else num.add(i,st.nextToken());
				}
			}
			
			sb.append("#").append(t);
			for (int i = 0; i < 10; i++)
				sb.append(" ").append(num.get(i));
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}