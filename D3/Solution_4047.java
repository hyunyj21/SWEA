/*
 * [D3] 4047. 영준이의 카드 카운팅
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_4047 {
	static String input;
	static boolean[][] card;
	static boolean check;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			input = in.readLine();
			card = new boolean[4][14];
			
			check = true;
			for (int i = 0, len = input.length(); i < len; i += 3) {
				if (!check) break;
				
				switch (input.charAt(i)) {
					case 'S':
						solve(0,i);
						break;
					case 'D':
						solve(1,i);
						break;
					case 'H':
						solve(2,i);
						break;
					case 'C':
						solve(3,i);
						break;
				}
			}
			
			if (!check) {
				sb.append("ERROR").append("\n");
				continue;
			}
			
			for (int i = 0; i < 4; i++) {
				int cnt = 13;
				
				for (int j = 0; j < 14; j++) {
					if (card[i][j]) cnt--;
				}
				
				sb.append(cnt).append(" ");
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void solve(int idx, int i) {
		int num = Integer.parseInt(input.substring(i+1, i+3));
		
		if (card[idx][num]) {
			check = false;
			return;
		}
		
		card[idx][num] = true;
	}
}