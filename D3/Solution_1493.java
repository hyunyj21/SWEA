/*
 * [D3] 1493. 수의 새로운 연산
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1493 {
	static int p, q, max = 301;
	static int[][] num = new int[max][max];
	
	public static void main(String[] args) throws Exception {
		for (int i = 1; i < max; i++) {
			if (i > 2) q = (i-2)*(i-1)/2;
			p = 2*i-1;
			
			for (int j = 1; j < max; j++)
				num[j][i] = j*(j+p)/2+q;
		}
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			p = Integer.parseInt(st.nextToken());
			q = Integer.parseInt(st.nextToken());
			
			int cnt = 0, row = 0, col = 0;
			for (int i = 0; i < max; i++) {
				if (cnt == 2) break;
				
				for (int j = 0; j < max; j++) {
					if (num[i][j] == p) {
						row += i;
						col += j;
						cnt++;
					}
					
					if (num[i][j] == q) {
						row += i;
						col += j;
						cnt++;
					}
					
					if (cnt == 2) break;
				}
			}
			
			sb.append("#").append(t).append(" ").append(num[row][col]).append("\n");
		}
		
		System.out.println(sb);
	}
}