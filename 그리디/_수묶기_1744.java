package _그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
 * 1은 곱해지는 것보다 그냥 더하는게 더 큰수를 만들 수 있기 때문에 1도 따로 빼서 생각한다.
 * 테스트 케이스가 없었다면 찾지 못했을꺼 같다.
 * 조금 더 신중하게 생각할 필요가 있다.
 */

public class _수묶기_1744 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> minus = new ArrayList<Integer>();
		ArrayList<Integer> plus = new ArrayList<Integer>();
		int zero = 0;
		int one = 0;
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num > 1) {
				plus.add(num);
			}else if(num < 0) {
				minus.add(num);
			}else if(num == 0){
				zero++;
			}else {
				one++;
			}
		}
		
		int ans = one;
		
		Collections.sort(plus, Collections.reverseOrder());
		for (int i = 0; i < plus.size(); i++) {
			if(i+1 == plus.size()) ans += plus.get(i);
			else {
				ans += plus.get(i) * plus.get(i+1);
				i++;
			}
		}
		
		Collections.sort(minus);
		for (int i = 0; i < minus.size(); i++) {
			if(i+1 == minus.size()) {
				if(zero == 0) {
					ans += minus.get(i);
				}
			}
			else {
				ans += minus.get(i) * minus.get(i+1);
				i++;
			}
		}
		
		System.out.println(ans);
	}

}
