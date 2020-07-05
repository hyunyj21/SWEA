/*
 * [D3] 1215. [S/W 문제해결 기본] 3일차 - 회문1
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1215 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			int cnt = Integer.parseInt(in.readLine());
			char[][] word = new char[8][8];
			
			for (int i = 0; i < 8; i++) {
				String tmp = in.readLine();
				
				for (int j = 0; j < 8; j++)
					word[i][j] = tmp.charAt(j);
			}
			
			int ans = 0, len = 8-cnt+1, size = cnt/2;
			boolean row, col;
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < len; j++) {
					row = true;
					col = true;
					
					for (int k = 0; k < size; k++) {
						if (!row && !col) break;
						if (row && word[i][j+k] != word[i][j+cnt-1-k]) row = false;
						if (col && word[j+k][i] != word[j+cnt-1-k][i]) col = false;
					}
					
					if (row) ans++;
					if (col) ans++;
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}