package Q1978.day2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int num,num1,count2=0,result=0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i =0;i<num;i++) {
			num1 = sc.nextInt();
			for(int j=1;j<=num1;j++) {
				if(num1%j ==0) {
					count2++;
				}
				
			}
			if(count2 == 2) {
				result++;
			}
			count2 = 0;
		}
		System.out.println(result);
	}
}
