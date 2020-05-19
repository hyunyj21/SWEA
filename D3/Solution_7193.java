/*
 * [D3] 7193. 승현이의 수학공부
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_7193 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			String X = st.nextToken();
			
			int ans = 0;
			for (int i = 0, len = X.length(); i < len; i++)
				ans += X.charAt(i) - '0';
			
			ans = ans%(N-1);
			System.out.println("#"+t+" "+ans);
		}
	}
}