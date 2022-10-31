package _분할정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _쿼드트리_1992 {

	/*
	 * 띄어쓰기 안된애들 StringTokenizer로 나눔,, 이런 사소한 실수 하지 맙시다.
	 */
	
	public static boolean same(int[][] arr, int x, int y, int n) {
		for (int i = x; i < x+n; i++) {
			for (int j = y; j < y+n; j++) {
				if(arr[x][y] != arr[i][j]) return false;
			}
		}
		return true;
	}
	public static void solve(int[][] arr, int x, int y, int n, StringBuilder sb) {
		if(same(arr, x, y, n)) {
			sb.append(arr[x][y]);
			return;
		}
		
		sb.append("(");
		int m = n/2;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				solve(arr, x+i*m, y+j*m, m, sb);
			}
		}
		sb.append(")");
	}
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split("");
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(s[j]);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		solve(arr, 0, 0, n, sb);
		System.out.println(sb);
	}

}
