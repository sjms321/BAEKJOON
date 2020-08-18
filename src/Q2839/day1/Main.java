package Q2839.day1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kg =sc.nextInt();
		int Five,Three,result=0;
		
		Five = kg/5;
		Three =0;
		if(kg%5==0) {result = Five;}
		else 
		{
			while (kg >=3) {
				kg -= 3;
				Three++;
				result = kg / 5 + Three;		
				if(kg % 5 ==0 )break;
				if(kg == 1||kg==2) {
					result = -1; break;
				}
			}
		}
		System.out.println(result);
	}
}
