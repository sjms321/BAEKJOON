package Q15649;

import java.util.Scanner;

public class Main {
	public static boolean[] check = new boolean[10];
	public static int[] a = new int[10];
	public static void go(int index,int n,int m) {
		if(index ==m) {
			for(int i = 0;i<m;++i) {
				System.out.print(a[i]);
				if(i != m-1)System.out.print(' ');
			}
			System.out.println();
			return;
		}
		
		for(int i=1;i<=n;++i) {
			if(check[i])
				continue;
			check[i]=true;
			a[index]=i;
			go(index+1,n,m);
			check[i]=false;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n,m;
		n= sc.nextInt();
		m= sc.nextInt();
		
		go(0,n,m);
		
	}
}
