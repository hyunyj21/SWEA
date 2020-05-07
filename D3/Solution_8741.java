/*
 * [D3] 8741. 두문자어
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8741 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#"+t+" ");
			
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			for (int i = 0; i < 3; i++)
				sb.append((char)(st.nextToken().charAt(0)-32));
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}