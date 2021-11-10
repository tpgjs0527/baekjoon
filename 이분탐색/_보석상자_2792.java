package _이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _보석상자_2792 {

	static int n, m, max;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		int[] color = new int[m];
		
		max = 0;
		for (int i = 0; i < m; i++) {
			color[i] = Integer.parseInt(br.readLine());
			if(color[i] > max) max = color[i]; 
		}
		
		System.out.println(find(color));
	}
	static int find(int[] color) {
		
		int l = 1;
		int r = max;
		int ans = Integer.MAX_VALUE;
		
		while(l<=r) {
			int num = (l+r) / 2;
			
			int tmp = 0;
			for (int i = 0; i < m; i++) {
				tmp += color[i] / num;
				if(color[i] % num != 0) tmp++;
			}
			
			if(tmp <= n) {
				ans = num;
				r = num-1;
			}else {
				l = num+1;
			}
		}
		
		return ans;
	}

}

/*
 
 문제를 보고 어떻게 이분탐색을 적용할지에 대해 조금더 연습이 필요할것같다
 
*/