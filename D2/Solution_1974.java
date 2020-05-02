/*
 * [D2] 1974. 스도쿠 검증
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1974 {
	static int[][] dir = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int[][] puzzle = new int[9][9];
			boolean[] check = null;
			boolean same = false;
			
			for (int i = 0; i < 9; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				check = new boolean[10];
				
				for (int j = 0; !same && j < 9; j++) {
					int tmp = Integer.parseInt(st.nextToken());
					puzzle[i][j] = tmp;
					
					if (!check[tmp]) check[tmp] = true; //가로
					else same = true;
				}
			}
			
			for (int i = 0; !same && i < 9; i++) { //세로
				check = new boolean[10];

				for (int j = 0; j < 9; j++) {
					if (!check[puzzle[j][i]]) check[puzzle[j][i]] = true;
					else same = true;
				}
			}
			
			for (int i = 1; !same && i < 9; i+=3) { //사각형
				
				for (int j = 1; !same && j < 9; j+=3) {
					check = new boolean[10];
					check[puzzle[i][j]] = true;
					
					for (int k = 0; !same && k < 8; k++) {
						int r = i + dir[k][0];
						int c = j + dir[k][1];
						
						if (!check[puzzle[r][c]]) check[puzzle[r][c]] = true;
						else same = true;
					}
				}
			}
			
			if (same) System.out.println("#"+t+" "+0);
			if (!same) System.out.println("#"+t+" "+1);
		}
	}
}