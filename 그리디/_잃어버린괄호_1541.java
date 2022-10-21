package _그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 정규식에서 .과+에는 특별한 의미를 가지기 때문에 앞에 구분자 \\를 붙여줘야한다
 */
public class _잃어버린괄호_1541 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		String[] num = s.split("-|\\+");
		
		int ans = Integer.parseInt(num[0]);
		int idx = 1;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '-') {
				for (int j = idx; j < num.length; j++) {
					ans -= Integer.parseInt(num[j]);
				}
				break;
			}
			if(s.charAt(i) == '+') {
				ans += Integer.parseInt(num[idx]);
				idx++;
			}
		}
		
		System.out.println(ans);
	}

}
