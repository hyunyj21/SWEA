/*
 * [D3] 7510. 상원이의 연속 합
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_7510 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			
			if ((N & (-N)) == N) { //2의 거듭제곱
				System.out.println("#"+t+" 1");
				continue;
			}
			
			int sum = 1, idx = 1, ans = 0;
			while(sum <= N) {
				if ((N-sum)%idx == 0) ans++;
				idx++; 
				sum += idx;
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}