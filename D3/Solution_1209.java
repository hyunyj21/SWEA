/*
 * [D3] 1209. [S/W 문제해결 기본] 2일차 - Sum
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1209 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			in.readLine();
			int[] row = new int[101];
			int[] col = new int[101];
			
			for (int i = 0; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				
				for (int j = 0; j < 100; j++) {
					int tmp = Integer.parseInt(st.nextToken());
					
					if (i == j) row[100] += tmp;
					if (i+j == 99) col[100] += tmp;
					row[i] += tmp;
					col[j] += tmp;
				}
			}
			
			Arrays.sort(row);
			Arrays.sort(col);
			int ans = Math.max(row[100], col[100]);
			
			System.out.println("#"+t+" "+ans);
		}
	}
}