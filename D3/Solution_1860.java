/*
 * [D3] 1860. 진기의 최고급 붕어빵
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1860 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[] time = new int[N];
			st = new StringTokenizer(in.readLine(), " ");
			
			for (int i = 0; i < N; i++)
				time[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(time);
			
			if (time[0] == 0) {
				sb.append("Impossible\n");
				continue;
			}
			
			int mul = time[0]/M+1, cnt = (mul-1)*K, tmp;
			boolean ans = true;
			for (int i = 0; i < N; i++) {
				if (time[i] >= M*mul) {
					tmp = time[i]/M;
					cnt += (tmp-mul+1)*K;
					mul = tmp+1;
				}
				
				if (cnt != 0) cnt--;
				else {
					ans = false;
					break;
				}
			}
			
			if (ans) sb.append("Possible\n");
			else sb.append("Impossible\n");;
		}
		
		System.out.println(sb);
	}
}