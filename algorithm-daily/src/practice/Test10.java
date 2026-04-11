/*
 问题描述
研究员小蓝受到实验室主任的指示，需要对实验室新研发的 𝑛 个新型能量电池进行分组实验。
这 𝑁 个能量电池的能量值分别用 𝐴 1 , 𝐴 2 , … , 𝐴 𝑁 表示，每个能量值都是一个整数。
为了保证实验的安全性，小蓝需要将这 𝑁 个能量电池分成两组，
使得这两组能量电池的能量值异或和相等。 能量值的异或和计算方法如下：
对于一个集合 𝑆 ，其异或和等于集合中所有元素的按位异或结果。
例如，集合 { 1 , 2 , 3 } 的异或和为 1 ⊕ 2 ⊕ 3 = 0 ，其中 ⊕ 表示异或运算。
现在，小蓝想知道，这 𝑛 个能量电池能否分成两组，使得这两组能量电池的能量值异或和相等。
注意，每组至少包含一个能量电池。 请你帮帮他！ 

输入格式 
输入的第一行包含一个整数 𝑇 ，表示测试用例的数量。 
每个测试用例占两行：
• 第一行包含一个整数 𝑁 ，表示能量电池的数量。 
• 第二行包含 𝑛 个整数 𝐴 1 , 𝐴 2 , … , 𝐴 𝑁 ，表示每个能量电池的能量值。 

输出格式 
对于每个测试用例，输出一行。如果可以将能量电池分成两组，
使得这两组能量电池的能量值异或和相等，则输出 YES；否则，输出 NO。

样例输入
2 
3 
1 2 3 
4 
1 2 3 4

样例输出 
YES 
NO
*/


package practice;

import java.util.ArrayList;
import java.util.Scanner;


public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		ArrayList<String> result= new ArrayList<String>();
		for (int i = 0; i < T; i++) {
			int N=scan.nextInt();
			int []A=new int [N];
			for (int j = 0; j < N; j++) {
				A[j]=scan.nextInt();
			}
			if(N>2&&yihuo(A)) {
				result.add("YES");
			}
			else {
				result.add("NO");
			}
		}
		
		for (int i = 0; i < T; i++) {
			System.out.println(result.get(i));
		}
	}
	public static boolean yihuo(int a[]) {
		int result=a[0];
		for (int i = 0; i < a.length-1; i++) {
			result=result^a[i+1];
		}
		if (result==0) {
			return true;
		}
		return false;
	}
}
