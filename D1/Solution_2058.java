/*
 * [D1] 2058. 자릿수 더하기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_2058 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int ans = 0;
		
		while (N != 0) {
			ans += N % 10;
			N /= 10;
		}
		
		System.out.println(ans);
	}
}