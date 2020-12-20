/*
 * [D4] 1211. [S/W 문제해결 기본] 2일차 - Ladder2
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1211 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			in.readLine();
			
			boolean[][] ladder = new boolean[100][100];
			for (int i = 0; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine());
				
				for (int j = 0; j < 100; j++) {
					if (st.nextToken().equals("1")) ladder[i][j] = true;
				}
			}
			
			int ans = 0, min = Integer.MAX_VALUE;
			for (int i = 0; i < 100; i++) {
				if (!ladder[0][i]) continue;
				
				int row = 0, col = i, cnt = 0;
				boolean[][] visited = new boolean[100][100];
				
				while (row < 99) {
					visited[row][col] = true;
					cnt++;
					
					if (col > 0 && ladder[row][col-1] && !visited[row][col-1]) {
						col--;
						continue;
					}
					
					if (col < 99 && ladder[row][col+1] && !visited[row][col+1]) {
						col++;
						continue;
					}
					
					row++;
				}
				
				if (cnt <= min) {
					min = cnt;
					ans = i;
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}