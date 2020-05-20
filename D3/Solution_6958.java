/*
 * [D3] 6958. 동철이의 프로그래밍 대회
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_6958 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int max = 0, num = 0, cnt = 0;
			for (int i = 0; i < N; i++) {
				String tmp = in.readLine().trim();
				cnt = 0;
				
				for (int j = 0, len = tmp.length(); j < len; j+=2)
					if (tmp.charAt(j) == '1') cnt++;
				
				if (cnt > max) {
					max = cnt;
					num = 1;
				} else if (cnt == max) num++;
			}
			
			System.out.println("#"+t+" "+num+" "+max);
		}
	}
}