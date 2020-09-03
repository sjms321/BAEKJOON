package Q2309;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] shortM = new int[10];
		for(int i = 1;i<10;i++) {
			shortM[i]= sc.nextInt();
		}
		int sum =0;
		
		for(int i =1;i<9;++i) {
			sum=0;
			int temp;
			temp = shortM[i];
			shortM[i]=0;
			for(int j=i+1;j<10;++j) {
				int temp2;
				temp2 = shortM[j];
				shortM[j]= 0;
				for(int e:shortM) {
					sum += e;
				}
				
				if(sum == 100)break;
				sum=0;
				shortM[j]=temp2;
				}
			if(sum == 100)break;
			shortM[i]=temp;
		}
		Arrays.sort(shortM);
		for(int i =3;i<10;++i) {
		System.out.println(shortM[i]);
		}
	}
}
