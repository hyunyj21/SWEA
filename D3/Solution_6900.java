/*
 * [D3] 6900. 주혁이의 복권 당첨
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_6900 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			String[] lotto = new String[N];
			int[] price = new int[N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				lotto[i] = st.nextToken();
				price[i] = Integer.parseInt(st.nextToken());
			}
			
			int ans = 0;
			for (int i = 0; i < M; i++) {
				String tmp = in.readLine();
				
				for (int j = 0; j < N; j++) {
					if (check(tmp, lotto[j])) {
						ans += price[j];
						break;
					}
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static boolean check(String in, String ans) {
		for (int i = 0; i < 8; i++) {
			if (ans.charAt(i) == '*') continue;
			if (in.charAt(i) != ans.charAt(i)) return false;
		}

		return true;
	}
}