/*
 * [D3] 6692. 다솔이의 월급 상자
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_6692 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			
			double ans = 0;
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				ans += Double.parseDouble(st.nextToken()) * Integer.parseInt(st.nextToken());
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}