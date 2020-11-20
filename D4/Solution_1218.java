/*
 * [D4] 1218. [S/W 문제해결 기본] 4일차 - 괄호 짝짓기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution_1218 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			int N = Integer.parseInt(in.readLine());
			String brackets = in.readLine();
			
			Stack<Character> stack = new Stack<>();
			int ans = 1;
			
			for (int i = 0; i < N; i++) {
				char tmp = brackets.charAt(i);
				
				if (tmp == '(' || tmp == '[' || tmp == '{' || tmp == '<') {
					stack.push(tmp);
					continue;
				}
				
				char left = stack.pop();
				if ((left == '(' && tmp != ')') || (left == '[' && tmp != ']') || (left == '{' && tmp != '}') || (left == '<' && tmp != '>')) {
					ans = 0;
					break;
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}