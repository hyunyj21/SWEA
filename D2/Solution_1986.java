/*
 * [D2] 1986. 지그재그 숫자
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1986 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			
			int ans = 0;
			for (int i = 1; i <= N; i++) {
				if (i%2 == 1) ans += i; //홀수
				else ans -= i; //짝수
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}