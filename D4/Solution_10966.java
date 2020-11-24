/*
 * [D4] 10966. 물놀이를 가자
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution_10966 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			boolean[][] map = new boolean[N][M];
			ArrayList<int[]> water = new ArrayList<>();
			
			for (int i = 0; i < N; i++) {
				String tmp = in.readLine();
				
				for (int j = 0; j < M; j++) {
					if (tmp.charAt(j) == 'W') {
						map[i][j] = true;
						water.add(new int[] {i, j});
					}
				}
			}
			
			int ans = 0;
			
			for (int i = 0; i < N; i++) {
				int min = Integer.MAX_VALUE;
				
				for (int j = 0; j < M; j++) {
					for (int l = 0, len = water.size(); l < len; l++) {
						int tmp = Math.abs(water.get(i)[0] - i) + Math.abs(water.get(i)[1] - i);
					}
					
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}