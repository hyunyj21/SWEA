/*
 * [D1] 2025. N줄덧셈
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_2025 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int tmp = n/2;
		
		if (n%2 == 0) System.out.println((1+n)*tmp);
		else System.out.println((1+n*tmp)+1);
	}
}