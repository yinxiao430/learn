package practice;

import java.util.Arrays;

import java.util.Scanner;

public class Test22 {
	private static int N;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        N=scan.nextInt();
        int c[]=new int[N];
        for (int i = 0; i < N; i++) {
			c[i]=scan.nextInt();
		}
        Arrays.sort(c);
       revered(c);
        int count=0;
       for (int i = 0; i < N; i++) {   
		if (i%3==2) {
			continue;
		}
		count+=c[i];
	}
       System.out.println(count);
        scan.close();
    }
    public static void revered(int c[]) {
		for (int i = 0; i < N/2; i++) {
			int flag=c[i];
			c[i]=c[N-1-i];
			c[N-1-i]=flag;
		}
	}
}