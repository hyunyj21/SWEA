/*
 * [D3] 9480. 민정이와 광직이의 알파벳 공부
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_9480 {
	static int N, ans;
	static String[] word;
	static boolean[] flag;
	static boolean[] alph;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			N = Integer.parseInt(in.readLine());
			word = new String[N];
			flag = new boolean[N];
			
			for (int i = 0; i < N; i++)
				word[i] = in.readLine();
			
			ans = 0;
			subset(0);
			
			System.out.println("#"+t+" "+ans);
		}
	} //end main()
	
	public static void subset(int cnt) {
		if (cnt == N) {
			alph = new boolean[26];
			
			for (int i = 0; i < N; i++) {
				if (flag[i]) check(word[i]);
			}
			
			for (int i = 0; i < 26; i++) {
				if (!alph[i]) return;
			}
			
			ans++;
			return;
		}
		
		flag[cnt] = true;
		subset(cnt+1);
		
		flag[cnt] = false;
		subset(cnt+1);
	} //end subset()
	
	public static void check(String word) {
		for (int i = 0, len = word.length(); i < len; i++) {
			if (!alph[word.charAt(i)-97]) alph[word.charAt(i)-97] = true;
		}
	} //end check()
}