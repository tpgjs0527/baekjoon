package _그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/*
 * 3의 배수 특징 : 각자리 숫자들의 합이 3의 배수이면 3의 배수이다
 * 내림차순 정렬은 Comparator.reverseOrder() 조건 추가 해주면 된다
 */

public class _30_10610 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] n = br.readLine().split("");
		
		int sum = 0;
		boolean pass = false;
		for (int i = 0; i < n.length; i++) {
			sum += Integer.parseInt(n[i]);
			if(Integer.parseInt(n[i]) == 0) {
				pass = true;
			}
		}
		
		if(pass && sum % 3 == 0) {
			Arrays.sort(n,Comparator.reverseOrder());
			for (int i = 0; i < n.length; i++) {
				System.out.print(n[i]);
			}
		}else {
			System.out.println(-1);
		}
	}

}
