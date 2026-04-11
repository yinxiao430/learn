package lanqiaobei14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        //在此输入您的代码...
		 int x[]=new int [5];
		 int y[]=new int [5];
		 x[1]=scan.nextInt();
		 y[1]=scan.nextInt();
		 x[2]=scan.nextInt();
		 y[2]=scan.nextInt();
		 
		 x[3]=scan.nextInt();
		 y[3]=scan.nextInt();
		 x[4]=scan.nextInt();
		 y[4]=scan.nextInt();
		 int s1_L=Math.abs(x[1]-x[2]);
		 int s1_W=Math.abs(y[1]-y[2]);
		 int s2_L=Math.abs(x[3]-x[4]);
		 int s2_W=Math.abs(y[3]-y[4]);
		int s1=s1_L*s1_W;
		int s2=s2_L*s2_W;
		int all=s1+s2;
		 if (chongd(x, y)) {
			 Arrays.sort(x);
			 Arrays.sort(y);
			 int c_L=Math.abs(x[3]-x[2]);
			 int c_W=Math.abs(y[3]-y[2]);
			 int sc=c_L*c_W;
			 System.out.println(all-sc);
		}else {
			System.out.println(all);
		}
		 
	        scan.close();
	}
	public static boolean chongd(int x[],int y[]) {
		boolean flag=true;
		if ((x[1]>x[2]&&x[2]>x[3]&&x[3]>x[4])||(x[3]>x[4]&&x[4]>x[1]&&x[1]>x[2])||
			(y[1]>y[2]&&y[2]>y[3]&&y[3]>y[4])||(y[3]>y[4]&&y[4]>y[1]&&y[1]>y[2])) {
			flag=false;	
		}
		return flag;
	}
	
}
