package studt_1st;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		Arrays.sort(arr);
		int sum=0;
		int temp=0;
		int[] answer = new int[num];
		for (int i = 0; i < arr.length; i++) {
			temp += arr[i];
			answer[i]= temp;
		}
		for (int i = 0; i < answer.length; i++) {
			sum += answer[i];
		}
		System.out.println(sum);
	}
}
