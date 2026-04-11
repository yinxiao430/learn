package practice;

import java.util.Scanner;
//B1
public class Test6 {

	public static void main(String[] args) {
        //在此输入您的代码...
		int count=0;
		for (int i = 1; i <= 2025; i++) {
			int a=i%10;
			if(shuzi(a)) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static boolean shuzi(int n) {
		int a=n*n*n;
		if(a%10==3) {
			return true;
		}
		return false;
	}
}
