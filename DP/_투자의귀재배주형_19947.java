package _DP;

import java.util.Scanner;

/*
 * 나는 5이상,3이상,그이외 로 나눠서 풀었지만 다른사람이 푼 방식이 더 깔끔했다
 * dp[i] = (long)Math.floor(dp[i-1] * 1.05);
	if(i >= 3)
		dp[i] = Math.max((long)Math.floor(dp[i-3] * 1.2), dp[i]);
	if(i >= 5)
		dp[i] = Math.max((long)Math.floor(dp[i-5] * 1.35), dp[i]);
 */
public class _투자의귀재배주형_19947 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int Y = sc.nextInt();
		
		int[] dp = new int[11];
		dp[0] = H;
		
		for (int i = 1; i <= Y; i++) {
			if(0 <= i-5) {
				dp[i] = Math.max( Math.max( (int)(dp[i-5]*1.35), (int)(dp[i-3]*1.2) ), (int)(dp[i-1]*1.05) );
			}else if(0 <= i-3) {
				dp[i] = Math.max( (int)(dp[i-3]*1.2), (int)(dp[i-1]*1.05));
			}else {
				dp[i] = (int)(dp[i-1]*1.05);
			}
		}
		
		System.out.println(dp[Y]);
	}

}
