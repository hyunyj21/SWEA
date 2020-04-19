/*
 * [D1] 2063. 중간값 찾기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_2063 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int[] score = new int[N];
		
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		for (int i = 0; i < N; i++)
			score[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(score);
		
		System.out.println(score[N/2]);
	}
}