package practice;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
//星际旅行
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Test18 {
	private static int n;
    private static boolean visit[];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int aa=scan.nextInt();
        n=aa+1;
        int m=scan.nextInt();
        int Q=scan.nextInt();
        int g[][]=new int[n][n];
        //邻接图,从1开始标记,没有0。
        //优化可以使用邻接表.时间复杂度降低
        for (int i = 0; i < m; i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			g[a][b]=1;
			g[b][a]=1;
		}
        int xy[][]=new int [Q][2];
        for (int i = 0; i < Q; i++) {
			for (int j = 0; j < 2; j++) {
				xy[i][j]=scan.nextInt();
			}
		}
        ArrayList<Integer> re=new ArrayList<Integer>();
        
        for (int i = 0; i < Q; i++) {
        	
			bfs(g, xy[i][0], xy[i][1]);
			int count=0;
			for (int j = 0; j < n; j++) {
				if (visit[j]==true) {
					count++;
				}
			}
			re.add(count);
			//System.out.println(i+":  "+count);
		}
        int sum=0;
        for (int i = 0; i < re.size(); i++) {
			sum+=re.get(i);
		}
        double result=(double)sum/(double)Q;
//        System.out.println(sum);
//        System.out.println(aa);
        System.out.printf("%.2f",result);
        scan.close();
    }
  //bfs.并记录深度
    public static void bfs(int g[][],int start,int step) {
    	visit=new boolean[n]; 
		visit[start]=true;
		ArrayDeque<Integer> deque=new ArrayDeque<Integer>();
		deque.add(start);
		int depth=0;
		while (!deque.isEmpty()&&depth<step) {
			int size=deque.size();
			for (int j = 0; j < size; j++) {
				start=deque.poll();		
				for (int i = 1; i < n; i++) {			
					if (visit[i]==false&&g[start][i]==1) {	
						visit[i]=true;
						deque.add(i);			
					}		
				}	
			}
			depth++;	
		}
	}
    
}
