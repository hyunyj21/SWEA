/*
 * [D2] 1288. 새로운 불면증 치료법
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1288 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			boolean[] check = new boolean[10];
			
			int cnt = 0, ans = 0, tmp = 0;
			while (cnt < 10) {
				ans += N;
				tmp = ans;
				
				while (tmp != 0) {
					if (!check[tmp%10]) {
						check[tmp%10] = true;
						cnt++;
					}
					tmp /= 10;
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}