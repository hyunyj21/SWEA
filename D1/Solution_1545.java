/*
 * [D1] 1545. 거꾸로 출력해 보아요
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1545 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(in.readLine());
		
		for (int i = N; i >= 0; i--) {
			sb.append(i).append(" ");
		}
		
		System.out.println(sb);
	}
}