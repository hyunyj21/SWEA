/*
 * [D3] 1217. [S/W 문제해결 기본] 4일차 - 거듭 제곱
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1217 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			in.readLine();
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int ans = (int) Math.pow(N, M);
			System.out.println("#"+t+" "+ans);
		}
	}
}