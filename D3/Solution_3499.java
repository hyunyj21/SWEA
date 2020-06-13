/*
 * [D3] 3499. 퍼펙트 셔플
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3499 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			int N = Integer.parseInt(in.readLine());
			int len = (N-1)/2+1;
			
			String[] card = new String[len+1];
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			for (int i = 0; i < len; i++)
				card[i] = st.nextToken();
			
			if (N%2 == 0) card[len] = "";
			
			sb.append(card[0]);
			for (int i = 1, left = N-len+1; i < left; i++)
				sb.append(" ").append(st.nextToken()).append(" ").append(card[i]);
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}