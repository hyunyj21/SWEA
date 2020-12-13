/*
 * [D4] 1224. [S/W 문제해결 기본] 6일차 - 계산기3
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution_1224 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			int N = Integer.parseInt(in.readLine());
			String expression = in.readLine();
			
			Stack<Integer> stack = new Stack<>();
			int ans = 0;
			
			for (int i = 0; i < N; i++) {
				switch (expression.charAt(i)) {
				case '(':
					stack.push(-1);
					break;
				case ')':
					int tmp = 0;
					while (true) {
						int num = stack.pop();
						
						if (num == -1) break;
						if (num == -2) {
							tmp *= stack.pop();
							break;
						}
						
						tmp += num;
					}
					
					stack.push(tmp);
					break;
				case '+':
					break;
				case '*':
					char next = expression.charAt(++i);
					
					if (next == '(') {
						stack.push(-2);
					} else {
						stack.push(stack.pop() * (next - '0'));
					}
					break;
				default:
					stack.push(expression.charAt(i) - '0');
					break;
				}
			}
			
			while (!stack.isEmpty()) {
				ans += stack.pop();
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}