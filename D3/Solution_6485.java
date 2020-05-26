/*
 * [D3] 6485. 삼성시의 버스 노선
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_6485 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t);
			int N = Integer.parseInt(in.readLine());
			int[] bus = new int[5001];
			
			StringTokenizer st;
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				
				for (int j = Integer.parseInt(st.nextToken()), len = Integer.parseInt(st.nextToken())+1; j < len; j++)
					bus[j]++;
			}
			
			N = Integer.parseInt(in.readLine());
			for (int i = 0; i < N; i++) {
				int tmp = Integer.parseInt(in.readLine());

				sb.append(" ").append(bus[tmp]);
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}