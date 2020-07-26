/*
 * [D3] 10505. 소득 불균형
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_10505 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int[] earn = new int[N];
			
			int sum = 0;
			for (int i = 0; i < N; i++) {
				earn[i] = Integer.parseInt(st.nextToken());
				sum += earn[i];
			}
			
			double avg = sum/N;
			
			int ans = 0;
			for (int i = 0; i < N; i++) {
				if (earn[i] > avg) continue;
				ans++;
			}
			
			sb.append("#").append(t).append(" ").append(ans).append("\n");
		}
		
		System.out.print(sb);
	}
}