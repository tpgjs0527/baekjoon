package _브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 완전 탐색 중 쉬운문제였지만 너무 어렵게 생각해서 막혔다
 주어진 타워의 높이들 중 하나씩 기준으로 잡아 가장 작은 시도 횟수를 답으로 하면 되는 문제 였다
 한번에 여러 타워를 기준으로 하려다가 보니 어려운 길로 갔던것 같다
 */
public class _블록놀이_16951 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] tower = new int[n];		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			tower[i] = Integer.parseInt(st.nextToken());
		}
		
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int tmp = 0;
			for (int j = 0; j < n; j++) {
				int check = k*(j-i) + tower[i];
				
				if(check < 1) {
					tmp = n;
					break;
				}
				
				if(check != tower[j]) tmp++;
			}
			
			ans = Math.min(ans, tmp);
		}
		
		System.out.println(ans);
	}

}