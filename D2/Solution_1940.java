/*
 * [D2] 1940. 가랏! RC카!
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1940 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			
			int cur = 0, ans = 0;
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				
				switch (Integer.parseInt(st.nextToken())) {
					case 0:
						ans += cur;
						break;
						
					case 1:
						cur += Integer.parseInt(st.nextToken());
						ans += cur;
						break;
						
					case 2:
						cur -= Integer.parseInt(st.nextToken());
						if (cur < 0) cur = 0;
						ans += cur;
						break;
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}