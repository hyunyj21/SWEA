/*
 * [D3] 6808. 규영이와 인영이의 카드게임
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_6808 {
	static int[] A, B;
	static int win, lose;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			boolean[] tmp = new boolean[19];
			A = new int[9];
			B = new int[9];
			
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			for (int i = 0; i < 9; i++) {
				int num = Integer.parseInt(st.nextToken());
				tmp[num] = true;
				A[i] = num;
			}
			
			int idx = 0;
			for (int i = 1; i < 19; i++)
				if (!tmp[i]) B[idx++] = i;
			
			win = lose = 0;
			do {
				game();
			} while (np());
			
			System.out.println("#"+t+" "+win+" "+lose);
		}
	}
	
	public static boolean np() {
		int i = 8;
		while(i>0 && B[i-1]>B[i]) i--;
		
		if (i == 0) return false;
		
		int j = 8;
		while(B[i-1]>B[j]) j--;
		
		int tmp = B[i-1];
		B[i-1] = B[j];
		B[j] = tmp;
		
		j = 8;
		while (i < j) {
			tmp = B[i];
			B[i] = B[j];
			B[j] = tmp;
			
			i++;
			j--;
		}
		
		return true;
	}
	
	public static void game() {
		int scoreA = 0, scoreB = 0;
		
		for (int i = 0; i < 9; i++) {
			if (A[i] > B[i]) scoreA += A[i]+B[i];
			else scoreB += A[i]+B[i];
		}
		
		if (scoreA > scoreB) win++;
		else if (scoreA < scoreB) lose++;
	}
}