/*
 * [D3] 7087. 문제 제목 붙이기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_7087 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			boolean[] alpha = new boolean[26];
			
			for (int i = 0; i < N; i++) {
				int idx = in.readLine().charAt(0) - 'A';
				if (!alpha[idx]) alpha[idx] = true;
			}
			
			int ans = 0;
			for (int i = 0; i < 26; i++) {
				if (alpha[i]) ans++;
				else break;
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}