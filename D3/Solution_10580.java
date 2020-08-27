/*
 * [D3] 10580. 전봇대
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Solution_10580 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			int[][] line = new int[N][2];
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				line[i][0] = Integer.parseInt(st.nextToken());
				line[i][1] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(line, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0]-o2[0];
				}
			});
			
			int ans = 0;
			for (int i = 0; i < N; i++) {
				for (int j = i+1; j < N; j++) {
					if (line[i][1] > line[j][1]) ans++;
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}