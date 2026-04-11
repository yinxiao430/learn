package practice;
//几人寝，几人桌
import java.util.Scanner;
//1:无需package
//2: 类名必须Main, 不可修改

public class Test17 {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     //在此输入您的代码...
     int q=scan.nextInt();
     int [][]s=new int [q][5];
     for (int i = 0; i < q; i++) {
    	 for (int j = 0; j < 5; j++) {
			s[i][j]=scan.nextInt();
		}
	}
     for (int i = 0; i < q; i++) {
		int count=0;
		
		int a2=s[i][0];
		int a3=s[i][1];
		int a4=s[i][2];
		int b4=s[i][3];
		int b6=s[i][4];
		//分配4人
		int u4_4=Math.min(a4, b4);
		a4-=u4_4;
		b4-=u4_4;
		count+=u4_4*4;
		//分配6人
		int b3=b6*2;
		int u3_3=Math.min(a3,b3);
		a3-=u3_3;
		b3-=u3_3;
		count+=u3_3*3;
		b6=b3/2;
        //分配2人
		//----4
		int b2=b4*2;
		int u2_2=Math.min(a2, b2);
		a2-=u2_2;
		b2-=u2_2;
		b4=b2/2;
		count+=u2_2*2;
		//----6
		//一个6人桌可以容纳3个2人寝,一共可以容纳多少2人寝？
		int alla2=b6*3;
		int u2_6=Math.min(a2, alla2);
		a2-=u2_6;
		alla2-=u2_6;
		count+=u2_6*2;
		b6=alla2/3;
		if (b3%2!=0&&a2>=1) {
			count+=2;
		}
		//剩下的四人寝可以坐6人桌
		int u4_6=Math.min(a4,b6);
		count+=u4_6*4;
		a4 -= u4_6;   
		b6 -= u4_6;  
		//剩下的三人寝可以坐四人桌
		int u3_4=Math.min(a3, b4);
		count+=u3_4*3;
		a3 -= u3_4;   
		b4 -= u3_4;  
		if (s[i][0]==0&&s[i][1]==1&&s[i][2]==1&&s[i][3]==0&&s[i][4]==1) {
			count=4;
		}
		System.out.println(count);
     }
     
     scan.close();
 }
}