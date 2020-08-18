package Q2966;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int num,sangCnt=0,changCnt=0,hyunCnt=0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		String sang="",chang="",hyun="",answer;
		answer = sc.next();
		for(int i=0; i<34;i++) {
			sang += "ABC";
		}
		for(int i=0; i<25;i++) {
			chang += "BABC";
		}
		for(int i=0; i<17;i++) {
			hyun += "CCAABB";
		}
		sang =sang.substring(0,num);
		chang =chang.substring(0,num);
		hyun =hyun.substring(0,num);
		char[] sangA = sang.toCharArray();
		char[] changA = chang.toCharArray();
		char[] hyunA = hyun.toCharArray();
		char[] answerA= answer.toCharArray();
		for(int i=0;i<num;i++) {
			if(sangA[i]==answerA[i])sangCnt++;
		}
		for(int i=0;i<num;i++) {
			if(changA[i]==answerA[i])changCnt++;
		}
		for(int i=0;i<num;i++) {
			if(hyunA[i]==answerA[i])hyunCnt++;
		}
		if(sangCnt==changCnt&&sangCnt==hyunCnt) {
			System.out.println(sangCnt);
			System.out.println("Adrian");
			System.out.println("Bruno");
			System.out.println("Goran");
		}
		else if(sangCnt==changCnt&&sangCnt!=hyunCnt) {
			if(sangCnt>hyunCnt) {
				System.out.println(sangCnt);
				System.out.println("Adrian");
				System.out.println("Bruno");
			}
			else {
				System.out.println(hyunCnt);
				System.out.println("Goran");
			}
		}
		else if(sangCnt==hyunCnt&&sangCnt!=changCnt) {
			if(sangCnt>changCnt) {
				System.out.println(sangCnt);
				System.out.println("Adrian");
				System.out.println("Goran");				
			}
			else {
				System.out.println(changCnt);
				System.out.println("Bruno");
			}
		}
		else if(changCnt==hyunCnt&&changCnt!=sangCnt) {
			if(changCnt>sangCnt) {
				System.out.println(changCnt);
				System.out.println("Bruno");
				System.out.println("Goran");	
			}
			else {
				System.out.println(sangCnt);
				System.out.println("Adrian");
			}
		}
		else {
			int max;
			  if (sangCnt >= changCnt && sangCnt >= hyunCnt) {
		            max = sangCnt;
		            System.out.println(max);
					System.out.println("Adrian");
		        } else if (changCnt >= sangCnt && changCnt >= hyunCnt) {
		            max = changCnt;
		            System.out.println(max);
					System.out.println("Bruno");
		        } else {
		            max = hyunCnt;
		            System.out.println(max);
					System.out.println("Goran");
		        }

		}
	
	}
}

