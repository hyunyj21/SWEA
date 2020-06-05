/*
 * [D3] 4698. 테네스의 특별한 소수
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_4698 {
	static boolean[] prime = new boolean[1000001];
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		prime[1] = true;
		for (int i = 2; i*i < 1000001; i++) {
			if (prime[i]) continue;
			
			for (int j = i*i; j < 1000001; j+=i)
				prime[j] = true;
		}
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			String D = st.nextToken();
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken())+1;
			
			int ans = 0;
			for (int i = A; i < B; i++) {
				if (prime[i]) continue;
				if (String.valueOf(i).contains(D)) ans++;
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}