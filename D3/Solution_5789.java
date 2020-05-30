/*
 * [D3] 5789. 현주의 상자 바꾸기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_5789 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t);
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken())+1;
			int Q = Integer.parseInt(st.nextToken())+1;
			int[] box = new int[N];
			
			for (int i = 1; i < Q; i++) {
				st = new StringTokenizer(in.readLine());
				int L = Integer.parseInt(st.nextToken());
				int R = Integer.parseInt(st.nextToken())+1;
				
				for (; L < R; L++)
					box[L] = i;
			}
			
			for (int i = 1; i < N; i++)
				sb.append(" ").append(box[i]);
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}