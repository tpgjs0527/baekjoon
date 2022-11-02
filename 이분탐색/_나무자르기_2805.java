package _이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _나무자르기_2805 {

	public static long check(long[] arr, long mid) {
		long tmp = 0;
		for (int i = 0; i < arr.length; i++) {
			long n = arr[i] - mid;
			if(n > 0) tmp += n;			
		}
		return tmp;
	}
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		
		long[] arr = new long[(int)n];
		st = new StringTokenizer(br.readLine());
		long max = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
			max = Math.max(max, arr[i]);
		}
		
		long l = 1;
		long r = max;
		long ans = 0;
		while(l <= r) {
			long mid = (l+r)/2;
			if(check(arr, mid) >= m) {
				ans = Math.max(ans, mid);
				l = mid + 1;
			}else {
				r = mid - 1;
			}
		}
		
		System.out.println(ans);
	}

}
