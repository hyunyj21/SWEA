/*
 * [D1] 2050. 알파벳을 숫자로 변환
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_2050 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = in.readLine();
		
		for (int i = 0, len = input.length(); i < len; i++)
			sb.append(input.charAt(i)-64 + " ");
		
		System.out.println(sb);
	}
}