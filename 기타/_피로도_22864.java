package _기타;

import java.util.Scanner;

public class _피로도_22864 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int m = s.nextInt();
		
		int work = 0;
		int tired = 0;
		if(a > m) {
			System.out.println(work);
		}else {
			for (int i = 0; i < 24; i++) {
				if(tired+a > m) {
					tired -= c;
					if(tired < 0) tired = 0;
				}else {
					tired += a;
					work += b;
				}
			}
			System.out.println(work);
		}
		
	}

}
