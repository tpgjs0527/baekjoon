package _재귀;

import java.util.Scanner;

public class _하노이탑이동순서_11729 {

	public static void hanoi(int n, int x, int y, StringBuilder sb) {
		if(n == 0) return;
		hanoi(n-1, x, 6-x-y, sb);
		sb.append(x + " " + y + "\n");
		hanoi(n-1, 6-x-y,y, sb);
	} 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println((1<<n)-1);
		
		StringBuilder sb = new StringBuilder();
		hanoi(n, 1, 3, sb);
		System.out.println(sb);
	}

}
