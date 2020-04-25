/*
 * [D1] 1933. 간단한 N의 약수
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1933 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(in.readLine());
		
		for (int i = 1; i <= N; i++) {
			if (N%i == 0) sb.append(i).append(" ");
		}
		
		System.out.println(sb);
	}
}