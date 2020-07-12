/*
 * [D3] 1208. [S/W 문제해결 기본] 1일차 - Flatten
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1208 {
	static int[] box = new int[100];
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			int dump = Integer.parseInt(in.readLine());
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			
			for (int i = 0; i < 100; i++)
				box[i] = Integer.parseInt(st.nextToken());
			
			for (int i = 0; i < dump; i++) {
				Arrays.sort(box);
				box[99]--;
				box[0]++;
			}
			
			Arrays.sort(box);
			System.out.println("#"+t+" "+(box[99]-box[0]));
		} 
	}
}