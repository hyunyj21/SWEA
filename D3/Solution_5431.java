/*
 * [D3] 5431. 민석이의 과제 체크하기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_5431 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t);
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken())+1;
			int K = Integer.parseInt(st.nextToken());
			boolean[] num = new boolean[N];
			
			st = new StringTokenizer(in.readLine(), " ");
			for (int i = 0; i < K; i++)
				num[Integer.parseInt(st.nextToken())] = true;
			
			for (int i = 1; i < N; i++) {
				if (!num[i]) sb.append(" ").append(i);
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}