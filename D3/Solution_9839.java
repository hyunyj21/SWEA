/*
 * [D3] 9839. 최고의 쌍
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_9839 {
	static int N, ans;
	static int[] num, idx = new int[2];
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			N = Integer.parseInt(in.readLine());
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			num = new int[N];
			
			for (int i = 0; i < N; i++)
				num[i] = Integer.parseInt(st.nextToken());
			
			ans = -1;
			combi(0, 0);
			
			System.out.println("#"+t+" "+ans);
		}
	} //end main()
	
	public static void combi(int i, int cnt) {
		if (cnt == 2) {
			int n1 = num[idx[0]];
			int n2 = num[idx[1]];
			
			if (n1 == n2) return;
			
			int mul =n1 * n2;
			
			int cur = mul % 10, next = 0;
			while((mul /= 10) != 0) {
				next = mul % 10;
				
				if (cur == next+1) cur = next;
				else return;
			}
			
			ans = Math.max(ans, n1 * n2);
			return;
		}
		
		for (int j = i; j < N; j++) {
			idx[cnt] = j;
			combi(j+1, cnt+1);
		}
	} //end combi()
}