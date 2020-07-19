/*
 * [D3] 3032. 홍준이의 숫자 놀이
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3032 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int[] r = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
			int[] s = {1, 0};
			int[] w = {0, 1};
			
			int q = 0, tmp = 0;
			while(r[1] != 0) {
				q = r[0]/r[1];
				
				tmp = r[1];
				r[1] = r[0] - r[1]*q;
				r[0] = tmp;
				
				tmp = s[1];
				s[1] = s[0] - s[1]*q;
				s[0] = tmp;
				
				tmp = w[1];
				w[1] = w[0] - w[1]*q;
				w[0] = tmp;
			}
			
			sb.append("#").append(t).append(" ").append(s[0]).append(" ").append(w[0]).append("\n");
		}
		
		System.out.println(sb);
	}
}