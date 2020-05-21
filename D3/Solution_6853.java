/*
 * [D3] 6853. 직사각형과 점
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_6853 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(in.readLine());
			int[] p = new int[4];
			
			for (int i = 0; i < 4; i++)
				p[i] = Integer.parseInt(st.nextToken());
			
			int[] ans = new int[3];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				if ((x>p[0]&&x<p[2]) && (y>p[1]&&y<p[3])) ans[0]++;
				else if (x<p[0] || x>p[2] || y<p[1] || y>p[3]) ans[2]++;
				else ans[1]++;
			}
			
			System.out.println("#"+t+" "+ans[0]+" "+ans[1]+" "+ans[2]);
		}
	}
}