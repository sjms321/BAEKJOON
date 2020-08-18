package Q10953;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,r;
		String nums;
		num = sc.nextInt();
		int[] sum = new int[num]; 
		for (int i = 0; i < num; i++) {
			nums = sc.next();
			String[] AB = nums.split(",",2);
			sum[i]= Integer.parseInt(AB[0])+Integer.parseInt(AB[1]);
		}
		for(int e : sum) {
			System.out.println(e);
		}
	}
}
