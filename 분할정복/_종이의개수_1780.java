package _분할정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 분할 시 조금 더 간단하게 할 수 있도록 연습이 필요하다.
 */
public class _종이의개수_1780 {
	public static boolean same(int[][] p, int x, int y, int n) {
		for (int i = x; i < x+n; i++) {
			for (int j = y; j < y+n; j++) {
				if(p[x][y] != p[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void f(int[][] p, int[] ans, int x, int y, int n) {
		if(same(p, x, y, n)) {
			ans[p[x][y]+1]++;
			return;
		}
		
		int m = n/3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				f(p, ans, x+i*m, y+j*m, m);
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] p = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				p[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[] ans = new int[3];
		
		f(p, ans, 0, 0, n);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(ans[i]);
		}
	}
}
