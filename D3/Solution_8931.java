/*
 * [D3] 8931. 제로
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution_8931 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int K = Integer.parseInt(in.readLine());
			
			Stack<Integer> stack = new Stack<>();
			for (int i = 0; i < K; i++) {
				int tmp = Integer.parseInt(in.readLine());
				
				if (tmp == 0) {
					stack.pop();
					continue;
				}
				
				stack.add(tmp);
			}
			
			long ans = 0;
			while(!stack.isEmpty()) {
				ans += stack.pop();
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}