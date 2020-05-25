/*
 * [D3] 6781. 삼삼 트리플 게임
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_6781 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			String num = in.readLine(), color = in.readLine();
			int[][] cards = new int[3][10];
			
			for (int i = 0; i < 9; i++) {
				int idx = 0;
				
				switch (color.charAt(i)) {
					case 'R': idx = 0; break;
					case 'G': idx = 1; break;
					case 'B': idx = 2; break;
				}
				
				cards[idx][num.charAt(i)-'0']++;
			}
			
			int ans = 0;
			stop:
			for(int[] card : cards) {
				for (int i = 1; i < 10; i++) {
					if (card[i] > 2) {
						card[i] -= 3;
						ans++;
						
						if (ans == 3) break stop;
					}
					
					while (i < 8 && card[i] != 0 && card[i+1] != 0 && card[i+2] != 0) {
						card[i]--; card[i+1]--; card[i+2]--;
						ans++;

						if (ans == 3) break stop;
					}
				}
			}
			
			if (ans == 3) System.out.println("#"+t+" Win");
			else System.out.println("#"+t+" Continue");
		}
	}
}