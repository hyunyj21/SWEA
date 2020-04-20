/*
 * [D1] 2046. 스탬프 찍기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_2046 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < N; i++)
			sb.append("#");
		
		System.out.println(sb);
	}
}