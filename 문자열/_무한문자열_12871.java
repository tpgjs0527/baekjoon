package _문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
첫 시도에서 짧은 문자열 길이만큼 긴 문자열을 잘라내서 같은지 아닌지 비교하는 방식으로 풀었는데 틀렸다.
반례를 보고 나서 긴 문자열 길이의 2배 만큼 돌면서 서로 확인하는 방식으로 풀면 되겠다고 생각한 후 풀었는데 맞았다.
*/

public class _무한문자열_12871 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split("");
		String[] t = br.readLine().split("");
				
		boolean same = true;
		
		int len = s.length > t.length ? s.length : t.length;
		int ss = 0;
		int tt = 0;
		for (int i = 0; i < len*2; i++) {
			if(!s[ss].equals(t[tt])) {
				same = false;
				break;
			}else {
				ss++; tt++;
				if(ss >= s.length) ss = 0;
				if(tt >= t.length) tt = 0;
			}
		}
		
		if(same) System.out.println(1);
		else System.out.println(0);
	}

}
