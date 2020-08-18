package Q2439;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		num= sc.nextInt();
		String[] star = new String[num];
		for (int i = 0; i < star.length; i++) {
			star[i]=" ";
		}
		for (int i = num-1; i >-1; i--) {
			star[i]="*";
			for(String e : star) {
				System.out.print(e);
			}
			System.out.println();
		}

		
}}
