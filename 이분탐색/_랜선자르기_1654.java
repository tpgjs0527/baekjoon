package _이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 예제를 보고 int 범위를 넘을 수도 있는지 잘 확인하면서 문제를 풀어야 한다
 */
public class _랜선자르기_1654 {

	public static long check(long[] arr, long m) {
		long cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			cnt += arr[i] / m;
		}
		return cnt;
	}
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long k = Integer.parseInt(st.nextToken());
		long n = Integer.parseInt(st.nextToken());
		
		long[] arr = new long[(int)n];
		long max = 0;
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) max = arr[i];
		}
		
		long l = 1;
		long r = max;
		long ans = 0;
		while(l <= r) {
			long m = (l + r) / 2;
			
			if(check(arr, m) < n) {
				r = m - 1;
			}else {
				if(m > ans) ans = m;
				l = m + 1;
			}
		}
		
		System.out.println(ans);
	}

}
