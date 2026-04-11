package practice;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if (isPrime(a)&&isPalindrome(a)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
   //质数
	public static boolean isPrime(int n) {
	    if (n < 2) return false;
	    for (int i = 2; i * i <= n; i++) {
	        if (n % i == 0) return false;
	    }
	    return true;
	}
	
	// 判断回文数
    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        // 反转数字
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n = n / 10;
        }
        // 比较原数和反转后的数是否相等
        return original == reversed;
    }
    //最大公约数
    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    //最小公倍数
    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
    
    //判断回文字符串
    public static boolean isHuiwen(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    //闰年
    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    
//    //一维前缀和
//    int n=9;
//
//    //求a[]的前缀和
//    int a[]=new int [n];
//    int[] pre = new int[n + 1];
//    
//    for (int i = 1; i <= n; i++) {
//        pre[i] = pre[i - 1] + a[i];
//    }
//    // 求 l~r 的和
//    int sum = pre[r] - pre[l - 1];//求2~4 r=4，l-1=1
//    
//    
//    //冒泡排序
//    for (int i = 0; i < n; i++) {
//        for (int j = 0; j < n - i - 1; j++) {
//            if (a[j] > a[j + 1]) {
//                int t = a[j];
//                a[j] = a[j + 1];
//                a[j + 1] = t;
//            }
//        }
//    }
}
