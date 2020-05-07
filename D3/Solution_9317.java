/*
 * [D3] 9317. 석찬이의 받아쓰기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_9317 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			String answer = in.readLine();
			String write = in.readLine();
			
			int ans = 0;
			for (int i = 0; i < N; i++) {
				if (answer.charAt(i) == write.charAt(i)) ans++;
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}