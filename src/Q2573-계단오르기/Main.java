package Q2573;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] stairs = new int[num + 1];
		int[] d = new int[num + 1];

		for (int i = 1; i <= num; i++) {
			stairs[i] = sc.nextInt();
		}

		d[1] = stairs[1];
		if(num>=2)d[2] = stairs[1] + stairs[2];
		
		for (int n = 3; n <= num; n++) {

			d[n] = Math.max(stairs[n - 1] + stairs[n]+d[n-3], d[n - 2] + stairs[n]);

		}

		System.out.println(d[num]);

	}
}
