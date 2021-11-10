package _브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
치킨 종류를 3개 정하고 사람마다 돌아가면서 제일 큰수를 더하면 되는 쉬운문제였는데
너무 어렵게 생각해서 오래 풀었다,,
np는 순열 조합에 좋은 함수이기 때문에 외울겸해서 사용했다
*/
public class _치킨치킨치킨_16439 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] ck = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				ck[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[] arr = new int[m];
		int cutline = n < 3 ? n : 3;
		for (int i = m-1; i > m-1-cutline; i--) {
			arr[i] = 1;
		}
		
		int max = 0;
		do {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int tmp = 0;
				for (int j = 0; j < m; j++) {
					if(arr[j] == 1) {
						tmp = Math.max(tmp, ck[i][j]);
					}
				}
				sum += tmp;
			}
			max = Math.max(max, sum);
		}while(np(arr));
		
		System.out.println(max);
	}
	static boolean np(int[] arr) {
		int n = arr.length;
		
		int i = n-1;
		while(i>0 && arr[i-1] >= arr[i]) i--;
		
		if(i==0) return false;
		
		int j = n-1;
		while(arr[i-1] >= arr[j]) j--;
		
		int tmp = arr[i-1];
		arr[i-1] = arr[j];
		arr[j] = tmp;
		
		int k = n-1;
		while(i < k) {
			tmp = arr[i];
			arr[i] = arr[k];
			arr[k] = tmp;
			i++;
			k--;
		}
		
		return true;
	}

}