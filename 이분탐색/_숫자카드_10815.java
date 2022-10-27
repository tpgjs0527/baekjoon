package _이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _숫자카드_10815 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] sg = new int[n];
		for (int i = 0; i < n; i++) {
			sg[i] = Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] card = new int[m];
		for (int i = 0; i < m; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] ans = new int[m];
		Arrays.sort(sg);
		for (int i = 0; i < m; i++) {
			int l = 0;
			int r = n-1;
			while(l <= r) {
				int mid = (l+r) / 2;
				if(sg[mid] == card[i]) {
					ans[i] = 1;
					break;
				}else if(sg[mid] > card[i]) {
					r = mid - 1;
				}else {
					l = mid + 1;
				}
			}
		}
		
		for (int i = 0; i < m; i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
