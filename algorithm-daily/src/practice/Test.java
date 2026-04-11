package practice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double []a= {0,0,1};
		double []b= {4,4,1};
		double c=distance(a, b);
		System.out.println(c);
	}
	public static double distance(double a[],double b[]) {
		double bian1=a[0]-b[0];
		double bian2=a[1]-b[1];
		double d=Math.hypot(bian1, bian2);
		double d_r=d-a[2]-b[2];
		return d_r;
	}

}
