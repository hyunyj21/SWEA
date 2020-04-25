/*
 * [D1] 2019. 더블더블
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_2019 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(in.readLine());
		
		int tmp = 1;
		for (int i = 0; i <= N; i++) {
			sb.append(tmp).append(" ");
			tmp *= 2;
		}
		
		System.out.println(sb);
	}
}