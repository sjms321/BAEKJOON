package Q11726;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] d = new int[1001];
		d[1]=1;
		d[2]=2;
		for(int i = 3; i<d.length;i++) {
			d[i]= (d[i-2]+d[i-1])%10007;
		}
		int num;
		num = sc.nextInt();
		System.out.println(d[num]);
	}
}
