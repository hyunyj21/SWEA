/*
 * [D3] 10761. 신뢰
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_10761 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			
			int[] memo = {1, 1, 1, 1, 0}; //B_min, B_max, O_min, O_max, ans
			for (int i = 0; i < N; i++) {
				String type = st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				
				if (type.equals("B")) solve(num, memo, 0, 2);
				else solve(num, memo, 2, 0);
			}
			
			sb.append("#").append(t).append(" ").append(memo[4]).append("\n");
		}
		
		System.out.print(sb);
	}
	
	public static void solve(int num, int[] memo, int t1, int t2) {
		int tmp = 1;
		
		if (num < memo[t1]) tmp = memo[t1] - num + 1;
		else if (num > memo[t1+1]) tmp = num - memo[t1+1] + 1;
		
		memo[4] += tmp;
		memo[t1] = memo[t1+1] = num;
		memo[t2] -= tmp;
		memo[t2+1] += tmp;
	}
}