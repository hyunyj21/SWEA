/*
 * [D3] 7964. 부먹왕국의 차원 관문
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_7964 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			
			int cnt = 0, ans = 0, input = 0;
			for (int i = 0; i < N; i++) {
				input = in.read();
				
				if (input == 48) {
					cnt++;
					
					if (cnt == D) {
						ans++;
						cnt = 0;
					}
				} else cnt = 0;
				
				in.read();
			}
			
			in.read();
			System.out.println("#"+t+" "+ans);
		}
	}
}