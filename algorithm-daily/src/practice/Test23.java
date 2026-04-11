package practice;

import java.util.Scanner;

public class Test23 {
   private static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int m=sc.nextInt();
		int pos=sc.nextInt();
		int count=0;
		for (int i = 0; i < n; i++) {
			int a=sc.nextInt();
			pos=(pos+a)%a;// 计算新位置，处理环形
			pos = (pos + m) % m;// 修正负数，确保位置在0~m-1之间
			if (pos == 0) {
                count++;
            }
		}
		
		 System.out.println(count);
		sc.close();
	}

}
