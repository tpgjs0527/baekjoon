package _문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
