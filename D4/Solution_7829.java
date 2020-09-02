/*
 * [D4] 7829. 보물왕 태혁
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_7829 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int P = Integer.parseInt(in.readLine());
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int[] num = new int[P];
			
			for (int i = 0; i < P; i++)
				num[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(num);
			
			int ans = num[0] * num[P-1];
			System.out.println("#"+t+" "+ans);
		}
	}
}