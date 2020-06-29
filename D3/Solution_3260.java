/*
 * [D3] 3260. 두 수의 덧셈
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution_3260 {
	static Stack<Integer> answer;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			String A = st.nextToken();
			String B = st.nextToken();
			int alen = A.length()-1;
			int blen = B.length()-1;
			
			if (alen > blen) add(A, B, alen, blen);
			else add(B, A, blen, alen);
			
			for (int i = 0, len = answer.size(); i < len; i++)
				sb.append(answer.pop());
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void add(String A, String B, int alen, int blen) {
		int ten = 0, tmp;
		answer = new Stack<>();
		
		do {
			tmp = ten;
			if (alen > -1) tmp += A.charAt(alen--) - '0';
			if (blen > -1) tmp += B.charAt(blen--) - '0';
			
			if (tmp/10 > 0) {
				ten = 1;
				tmp %= 10;
			} else ten = 0;
			
			answer.push(tmp);
		} while (blen>-1 || ten==1);
		
		for (int i = alen; i > -1; i--)
			answer.push(A.charAt(i)-'0');
	}
}