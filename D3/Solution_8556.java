/*
 * [D3] 8556. 북북서
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8556 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			String dir = in.readLine();
			
			int idx = dir.length()-1, n = 0, up = 0, down = 1, tmp = 0;
			while(idx > -1) {
				if (dir.charAt(idx-1) == 't') { //북
					if (idx == dir.length()-1) {
						idx -= 5;
						n++;
						continue;
					}
					
					tmp = (int) Math.pow(2, n);
					up = up*(tmp/down)-90;
					down = tmp;
					idx -= 5;
					n++;
				} else { //서
					if (idx == dir.length()-1) {
						up = 90;
						idx -= 4;
						n++;
						continue;
					}
					
					tmp = (int) Math.pow(2, n);
					up = up*(tmp/down)+90;
					down = tmp;
					idx -= 4;
					n++;
				}
			}
		
			while (down > 1 && up % 2 == 0) {
				up /= 2;
				down /= 2;
			}
			
			if (down == 1) System.out.println("#"+t+" "+up);
			else System.out.println("#"+t+" "+up+"/"+down);
		}
	}
}