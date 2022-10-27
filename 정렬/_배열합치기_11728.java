package _정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _배열합치기_11728 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int sn = 0;
		int sm = 0;
		StringBuilder sb = new StringBuilder();
		while(sn < n || sm < m) {
			if(sn >= n) {
				for (int i = sm; i < m; i++) {
					sb.append(b[i]+" ");
				}
				break;
			}
			if(sm >= m) {
				for (int i = sn; i < n; i++) {
					sb.append(a[i]+" ");
				}
				break;
			}
			if(a[sn] <= b[sm]) {
				sb.append(a[sn]+" ");
				sn++;
			}else {
				sb.append(b[sm]+" ");
				sm++;
			}
		}
		
		System.out.println(sb);
	}

}
