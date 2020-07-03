/*
 * [D3] 1873. 상호의 배틀필드
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1873 {
	static int H, W, x, y, dir;
	static char[][] map;
	static char[] direct = {'^', 'v', '<', '>'};
	static int[][] move = {{-1,0},{1,0},{0,-1},{0,1}};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			String input;
			
			map = new char[H][W];
			for (int i = 0; i < H; i++) {
				input = in.readLine();
				
				for (int j = 0; j < W; j++) {
					char tmp = input.charAt(j); 
					map[i][j] = tmp;
					
					if (tmp!='.' && tmp!='*' && tmp!='#' && tmp!='-') {
						x = i;
						y = j;
						switch(tmp) {
							case '^': dir = 0; break;
							case 'v': dir = 1; break;
							case '<': dir = 2; break;
							case '>': dir = 3; break;
						}
					}
				}
			}
			
			int N = Integer.parseInt(in.readLine());
			input = in.readLine();
			for (int i = 0; i < N; i++) {
				switch (input.charAt(i)) {
					case 'U': move(0); break;
					case 'D': move(1); break;
					case 'L': move(2); break;
					case 'R': move(3); break;
					case 'S': shoot(); break;
				}
			}
			
			sb.append("#").append(t).append(" ");
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++)
					sb.append(map[i][j]);
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	public static void move(int i) {
		map[x][y] = direct[i];
		dir = i;
		
		int r = x + move[i][0];
		int c = y + move[i][1];
		
		if (!check(r, c)) return;
		
		if (map[r][c] == '.') {
			map[x][y] = '.';
			map[r][c] = direct[i];
			x = r; y = c;
		}
	}
	
	public static void shoot() {
		int r = x, c = y;
		
		while(true) {
			r += move[dir][0];
			c += move[dir][1];
			
			if (!check(r,c)) break;
			
			char tmp = map[r][c];
			if (tmp=='.' || tmp=='-') continue;
			if (tmp=='*') {
				map[r][c] = '.';
				break;
			}
			if (tmp=='#') break;
		}
	}
	
	public static boolean check(int r, int c) {
		if (r>-1 && r<H && c>-1 && c<W) return true;
		else return false;
	}
}