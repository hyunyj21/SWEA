/*
 * [D2] 1976. 시각 덧셈
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1976 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			
			int hour = Integer.parseInt(st.nextToken());
			int minute = Integer.parseInt(st.nextToken());
			hour += Integer.parseInt(st.nextToken());
			minute += Integer.parseInt(st.nextToken());
			
			if (minute > 60) {
				hour++;
				minute -= 60;
			}
			
			if (hour > 12) hour -= 12;

			System.out.println("#"+t+" "+hour+" "+minute);
		}
	}
}