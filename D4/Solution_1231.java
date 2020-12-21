/*
 * [D4] 1231. [S/W 문제해결 기본] 9일차 - 중위순회
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_1231 {
	static ArrayList<Node> tree;
	static StringBuilder sb;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		for (int t = 1; t <= 10; t++) {
			int N = Integer.parseInt(in.readLine());
			tree = new ArrayList<>();
			tree.add(new Node(null, 0, 0));
			
			for (int i = 0; i < N; i++) {
				String[] tmp = in.readLine().split(" ");
				
				String data = null;
				int left = 0, right = 0;
				
				for (int j = 1, len = tmp.length; j < len; j++) {
					if (j == 1) {
						data = tmp[j];
						continue;
					}
					
					if (j == 2) {
						left = Integer.parseInt(tmp[j]);
						continue;
					}
					
					right = Integer.parseInt(tmp[j]);
				}
				
				tree.add(new Node(data, left, right));
			}
			
			sb.append("#"+t+" ");
			inorder(tree.get(1));
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
	
	public static void inorder(Node node) {
		if (node.data != null) {
			inorder(tree.get(node.left));
			sb.append(node.data);
			inorder(tree.get(node.right));
		}
	}
}

class Node {
	String data;
	int left;
	int right;
	
	public Node(String data, int left, int right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}