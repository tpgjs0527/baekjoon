package _그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
 * 람다식을 활용한 2차원 배열 정렬
 */
public class _회의실배정_1931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] a = new int[n][2];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a[i][0] = Integer.parseInt(st.nextToken());
			a[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a, (a1, a2) -> a1[1] == a2[1] ? a1[0] - a2[0] : a1[1] - a2[1]);
		
		int now = 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if(now <= a[i][0]) {
				now = a[i][1];
				ans++;
			}
		}
		System.out.println(ans);
	}

}
