package Q1463;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int[] d = new int[1000001];
		d[2] = 1;
		d[3] = 1;
		for(int i = 4; i<d.length; ++i) {
			if(i%3==0) {
				d[i] = Math.min(d[i/3], d[i-1])+1;
			}
			else if(i%2==0) {
				d[i] = Math.min(d[i/2], d[i-1])+1;
			}
			else d[i]=d[i-1]+1;
		}
		System.out.println(d[num]);
		
	}
}