package _덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class _덱_10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String s = st.nextToken();
			
			switch (s) {
			case "push_front":
				dq.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				dq.addLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				if(dq.size() == 0) sb.append(-1).append("\n");
				else sb.append(dq.removeFirst()).append("\n");
				break;
			case "pop_back":
				if(dq.size() == 0) sb.append(-1).append("\n");
				else sb.append(dq.removeLast()).append("\n");
				break;
			case "size":
				sb.append(dq.size()).append("\n");
				break;
			case "empty":
				sb.append(dq.isEmpty()?1:0).append("\n");
				break;
			case "front":
				if(dq.size() == 0) sb.append(-1).append("\n");
				else sb.append(dq.peekFirst()).append("\n");
				break;
			case "back":
				if(dq.size() == 0) sb.append(-1).append("\n");
				else sb.append(dq.peekLast()).append("\n");
				break;
			}
		}
		
		System.out.println(sb);
	}

}
/*
 
 자바의 ArrayDeque를 사용해보았다.
 
*/