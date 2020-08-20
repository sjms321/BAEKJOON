package Q1003;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
	/*
		ArrayList<Integer> zero= new ArrayList<Integer>();
		zero.add(1);
		zero.add(0);
		zero.add(1);
		for(int i=3;i<41;++i) {
			zero.add(zero.get(i-2)+zero.get(i-1));
		}
	*/	
		int[] zero = new int[41];
		zero[0]=1;
		zero[1]=0;
		for(int i=2; i<41;++i) {
			zero[i]=zero[i-2]+zero[i-1];
		}
		
		
	/*	ArrayList<Integer> one= new ArrayList<Integer>();
		one.add(0);
		one.add(1);
		one.add(1);
		for(int i=3;i<41;++i) {
			one.add(one.get(i-2)+one.get(i-1));
		}
		*/
		int[] one = new int[41];
		one[0]=0;
		one[1]=1;
		for(int i=2; i<41;++i) {
			one[i]=one[i-2]+one[i-1];
		}
		for(int i=0;i<num;++i) {
			int Number = sc.nextInt();
			System.out.println(zero[Number]);
			System.out.println(one[Number]);
		}


	}
}
