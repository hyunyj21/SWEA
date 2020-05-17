/*
 * [D3] 9940. 순열1
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_9940 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			boolean[] check = new boolean[N+1];

			boolean result = true;
			for (int i = 0; i < N; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				
				if (check[tmp]) {
					result = false;
					break;
				}
				
				check[tmp] = true;
			}
			
			if (result) System.out.println("#"+t+" Yes");
			else System.out.println("#"+t+" No");
		}
	}
}