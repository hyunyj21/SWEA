/*
 * [D3] 6781. 삼삼 트리플 게임
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_6781 {
	static int[] ans;
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
			
			ans = new int[2];
			stop:
			for(int[] card : cards) {
				int[] tmp = card.clone();
				
				up(card, 0);
				if (ans[0] == 3) break stop;
				same(card, 0);
				if (ans[0] == 3) break stop;
				
				same(tmp, 1);
				if (ans[1] == 3) break stop;
				up(tmp, 1);
				if (ans[1] == 3) break stop;
			}
			
			if (ans[0] == 3 || ans[1] == 3) System.out.println("#"+t+" Win");
			else System.out.println("#"+t+" Continue");
		}
	}
	
	/*public static void dfs(int idx) {
		if (idx == 9) return;
	}*/
	
	public static void up(int[] card, int idx) {
		for (int i = 0; i < 7; i++) {
			if (ans[idx] == 3) return;
			if (card[i] == 0) continue;
			
			while(card[i] != 0 && card[i+1] != 0 && card[i+2] != 0) {
				if (ans[idx] == 3) return;
				ans[idx]++;
				card[i]--; card[i+1]--; card[i+2]--;
			}
		}
	}
	
	public static void same(int[] card, int idx) {
		for (int i = 0; i < 9; i++) {
			if (ans[idx] == 3) return;
			if (card[i] >= 3) {
				ans[idx]++;
				card[i] -= 3;
			}
		}
	}
}