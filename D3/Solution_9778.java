/*
 * [D3] 9778. 카드 게임
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_9778 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			int N = Integer.parseInt(in.readLine());
			int[] card = {0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 16, 4};
			
			int sum = 0;
			for (int i = 0; i < N; i++) {
				int tmp = Integer.parseInt(in.readLine());
				sum += tmp;
				card[tmp]--;
			}
			
			int left = 21-sum, go = 0, stop = 0;
			if (left < 2) stop = 1;
			else if (left > 11) go = 1;
			else if (left < 7) {
				for (int i = 2; i <= left; i++)
					go += card[i];
				stop = 52-N-go;
			} else {
				for (int i = left+1; i <= 11; i++)
					stop += card[i];
				go = 52-N-stop;
			}
			
			if (go > stop) sb.append("GAZUA").append("\n");
			else sb.append("STOP").append("\n");
		}
		
		System.out.print(sb);
	}
}