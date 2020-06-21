/*
 * [D3] 2805. 농작물 수확하기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_2805 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			
			int ans = 0, mid = N/2+1, start = mid, end = mid-1;
			for (int i = 0; i < N; i++) {
				String input = in.readLine();
				
				if (i < mid) {
					start--;
					end++;
				} else {
					start++;
					end--;
				}
				
				for (int j = start; j < end; j++)
					ans += input.charAt(j) - '0';
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}