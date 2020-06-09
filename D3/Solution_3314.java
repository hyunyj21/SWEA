/*
 * [D3] 3314. 보충학습과 평균
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3314 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			
			int sum = 0;
			for (int i = 0; i < 5; i++) {
				int score = Integer.parseInt(st.nextToken());
				
				if (score < 40) sum += 40;
				else sum += score;
			}
			
			sb.append("#").append(t).append(" ").append(sum/5).append("\n");
		}
		
		System.out.println(sb);
	}
}