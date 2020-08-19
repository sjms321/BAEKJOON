package Q9095;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		int[] arr = new int[11];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=4;
		for(int i = 4; i<11;++i) {
			arr[i]=arr[i-3]+arr[i-2]+arr[i-1];
		}
		int[] arr1 = new int[num+1];
		arr1[0]=0;
		for(int i=1;i<num+1;i++) {
			arr1[i]=sc.nextInt();
		}
		
		for(int i=1; i<arr1.length;i++) {
			System.out.println(arr[arr1[i]]);
		}
		
	}
}