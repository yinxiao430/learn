package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test8 {
	private static boolean []isprime;
	private static int Max=200000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);
	        //在此输入您的代码...
		 initprime();
		 int h1=scan.nextInt();
		 int h2=scan.nextInt();
		 int []hang1=new int[h1];
		 int []hang2=new int[h2];
		 for (int i = 0; i < h1; i++) {
			hang1[i]=scan.nextInt();
		}
		 for (int i = 0; i < h2; i++) {
			hang2[i]=scan.nextInt();
		}
		 int nm=h1+h2;
		 Set<Integer> result=new HashSet<Integer>();
		 for (int i = 0; i < h1; i++) {
			 if(hang1[i]>nm) {continue;}
			 for (int j = 0; j < h2; j++) {
				int s=hang1[i]+hang2[j];
				
				if (s>=2&&s<=nm &&isprime[s]) {
					result.add(s);
				}
			}		
		}
		 System.out.println(result.size());
	     scan.close();
	}
	//质数
	public static void initprime() {
		isprime=new boolean [Max+1];
		for (int i = 2; i <= Max; i++) {
			isprime[i]=true;
		}
		for (int i = 2; i*i <= Max; i++) {
			if(isprime[i]) {
				for (int j = i*i ;j <= Max; j=j+i) {
					isprime[j]=false;
				}
			}
		}
	}
}
