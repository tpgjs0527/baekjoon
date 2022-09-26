package _백트래킹;

import java.util.Scanner;

public class _N과M3_15951 {
	
	static int n, m;
	static boolean[] visit;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		m = s.nextInt();
		
		visit = new boolean[n];
		arr = new int[m];
		f(0);
		System.out.println(sb);
	}
	
	static void f(int d) {
		if(d == m) {
			for (int i = 0; i < m; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = 0; i < n; i++) {
			visit[i] = true;
			arr[d] = i + 1;
			f(d+1);
			visit[i] = false;
		}
	}
}
