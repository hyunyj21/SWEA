/*
 * [D2] 1946. 간단한 압축 풀기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1946 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append("\n");
			int N =  Integer.parseInt(in.readLine());
			
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				String alpha = st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				
				while (num > 0) {
					if (cnt == 10) {
						sb.append("\n");
						cnt = 0;
					}
					
					sb.append(alpha);
					cnt++;
					num--;
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}