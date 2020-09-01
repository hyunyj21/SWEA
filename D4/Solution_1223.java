/*
 * [D4] 1223. [S/W 문제해결 기본] 6일차 - 계산기2
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1223 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			int N = Integer.parseInt(in.readLine())-1;
			String formula = in.readLine();

			int ans = 0, mul = 1;
			for (int i = 0; i < N; i+=2) {
				if (formula.charAt(i+1) == '+' && mul == 1) ans += formula.charAt(i)-'0';
				else if (formula.charAt(i+1) == '+' && mul != 1) {
					ans += mul * (formula.charAt(i)-'0');
					mul = 1;
				} else mul *= formula.charAt(i)-'0';
			}
			
			if (mul != 1) ans += mul*(formula.charAt(N)-'0');
			else ans += formula.charAt(N)-'0';
			
			System.out.println("#"+t+" "+ans);
		}
	}
}