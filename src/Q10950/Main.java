package Q10950;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B,num,result;
		num = sc.nextInt();
		int[] arr= new int[num];
		for (int i = 0; i < num; i++) {
			A= sc.nextInt();
			B= sc.nextInt();
			arr[i]=A+B;
		}
			for(int e : arr) {
				System.out.println(e);
			}
	}
}
