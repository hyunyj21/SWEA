/*
 * [D3] 5603. [Professional] 건초더미
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_5603 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			int[] num = new int[N];
			
			int sum = 0, tmp;
			for (int i = 0; i < N; i++) {
				tmp = Integer.parseInt(in.readLine());
				
				sum += tmp;
				num[i] = tmp;
			}
			
			sum /= N;
			
			int ans = 0;
			for (int i = 0; i < N; i++) {
				tmp = sum - num[i];
				
				if (tmp > 0) ans += tmp;
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}