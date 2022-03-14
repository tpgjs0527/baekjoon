package _문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * 문자열 문제
 * 최장공통부분수열 문제 같아서 어렵게 생각했는데 쉽게 풀수 있는 방법이었다. 
 */
public class _공통순열_1622 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		while(true) {
			String a = br.readLine();
			if(a==null) break;
			String b = br.readLine();
			
			int[] aArr = count(a);
			int[] bArr = count(b);
			
			for(int i = 0; i < 26; i++) {
				for(int j = 0; j < Math.min(aArr[i], bArr[i]); j++) {
					ans.append((char)('a'+i));
				}
			}
			ans.append("\n");
		}
		System.out.println(ans);
	}
	static int[] count(String s) {
		int[] cnt = new int[26];
		for(int i = 0; i < s.length(); i++) {
			cnt[s.charAt(i)-'a']++;
		}
		return cnt;
	}

}
