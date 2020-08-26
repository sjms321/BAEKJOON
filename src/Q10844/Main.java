package Q10844;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] d = new int[101][10];
		
		for(int i = 1; i<10;i++) {
			d[1][i]=1;
		}
		
		
		for (int n = 2; n <= 100; n++) {
			for (int m = 0; m < 10; m++) {
				if (m == 9)
					d[n][m] = d[n - 1][m - 1] % 1000000000;
				else if (m == 0)
					d[n][m] = d[n - 1][m + 1] % 1000000000;
				else
					d[n][m] = (d[n - 1][m - 1]% 1000000000 + d[n - 1][m + 1]% 1000000000) % 1000000000;

			}
		}

		int num = sc.nextInt();
		int result=0;
		for(int i=0;i<10;i++) {
			result+=d[num][i]%1000000000;
			result %= 1000000000;
		}
		System.out.println(result%1000000000);
	}
}
