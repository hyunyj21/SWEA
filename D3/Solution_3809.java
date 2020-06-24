/*
 * [D3] 3809. 화섭이의 정수 나열
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3809 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			
			String num = "";
			while(N != 0) {
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				
				while(st.hasMoreTokens()) {
					num += st.nextToken();
					N--;
				}
			}
			
			int ans = 0;
			while(true) {
				if (!num.contains(Integer.toString(ans))) break;
				ans++;
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}