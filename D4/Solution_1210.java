/*
 * [D4] 1210. [S/W 문제해결 기본] 2일차 - Ladder1
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1210 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			in.readLine();
			
			boolean[][] ladder = new boolean[100][100];
			int col = 0;
			
			for (int i = 0; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				
				for (int j = 0; j < 100; j++) {
					int tmp = Integer.parseInt(st.nextToken());
					
					if (tmp == 0) continue;
					else if (tmp == 1) ladder[i][j] = true;
					else col = j;
				}
			}
			
			int row = 99;
			while (row > 0) {
				ladder[row][col] = false;
				
				if (col > 0 && ladder[row][col-1] == true) {
					col -= 1;
					continue;
				}
				
				if (col < 99 && ladder[row][col+1] == true) {
					col += 1;
					continue;
				}
				
				row--;
			}
			
			System.out.println("#"+t+" "+col);
		}
	}
}