package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

//2的k次幂
public class Test13 {
	 public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	     //在此输入您的代码...
	     int n=scan.nextInt();
	     int k=scan.nextInt();
	     int num[]=new int[n];
	     for (int i = 0; i < n; i++) {
			num[i]=scan.nextInt();
		}
	     int []num_mi=new int[n];
	     for (int i = 0; i < n; i++) {
			num_mi[i]=K(num[i]);
		}
	     System.out.println(Arrays.toString(num_mi));
	     int s=sum(num_mi);
	     System.out.println(s);
	     ArrayList<Integer> min=new ArrayList<Integer>();
	     while (true) {
		     int addnum[]=jia(num, num_mi);
		     System.out.println(Arrays.toString(num_mi));
		     
		     for (int i = 0; i < n; i++) {
				if (addnum[i]!=-1) {
					min.add(addnum[i]);
				}
			}
		     int ss=sum(num_mi);
		     if (ss>=k) {
		    	 break;
			}
	     }
	     Collections.sort(min);//给集合排序
	     int result=0;
	     for (int i = 0; i < min.size(); i++) {
			result=result+min.get(i);
		}
	     System.out.println(result);
	     scan.close();
	 }
 
	 public static int K(int num) {
		 int a=num;
		  if (a==0) {
				return 0;
			}
		 int count=0;	 
		 while (a%2==0) {
			count++;
			a=a/2;
		}
		 return count;
	 }
	 public static int sum(int []num) {
		 int sum=0;
		for (int i = 0; i < num.length; i++) {
			sum=sum+num[i];
		}
		return sum;
	}
	 public static int[] jia(int []num,int []num_mi) {
		 int n=num.length;
		 int addnum[]=new int[n];
		 for (int i = 0; i < n; i++) {
			int count=1;
			int orinum=num[i];
			boolean flag=true;
			while (true) {
				int newnum=orinum+count;
				int mi=K(newnum);		
				if (newnum>100000) {
					flag=false;
					break;
				}
				if (mi>num_mi[i]) {
					num_mi[i]=mi;
					break;
				}
				count++;
			}
			if (flag==false) {addnum[i]=-1;}
			else {
				addnum[i]=count;
			}
			
		}
		 return addnum;
	 }
}
