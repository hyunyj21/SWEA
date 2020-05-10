/*
 * [D3] 8104. 조 만들기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8104 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine().trim());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t);
			StringTokenizer st = new StringTokenizer(in.readLine().trim(), " ");
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			if (N%2 == 0) { //짝수
				int tmp = 1+N*N/2*K+(N-1)/2;
				for (int i = 0; i < K; i++)
					sb.append(" ").append(tmp);
			} else { //홀수
				int tmp = 1+2*(N/2)*(N/2+1)*K+(N/2);
				for (int i = 0; i < K; i++) {
					sb.append(" ").append(tmp+i);
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}