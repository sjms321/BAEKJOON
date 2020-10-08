package study_3;

import java.util.Scanner;
import java.util.Stack;

public class Q10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		Stack<Integer> s = new Stack<Integer>();
		loop: for (int i = 0; i < K; ++i) {
			int num = sc.nextInt();
			if (num == 0) {
				if (s.empty()) {
					break loop;
				}
				s.pop();
			} else
				s.push(num);
		}
		int sum = 0;
		for (Integer e : s) {
			sum += e;
		}
		System.out.println(sum);
	}
}