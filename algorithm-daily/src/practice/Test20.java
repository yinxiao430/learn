package practice;
//水仙花数
public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i < 999; i++) {
			if (isNarcissistic(i)) {
				System.out.println(i);
			}
		}
		
	}
	public static boolean isNarcissistic(int n) {
	    if (n < 100 || n > 999) return false;

	    int a = n / 100;        // 百位
	    int b = n / 10 % 10;    // 十位
	    int c = n % 10;         // 个位

	    return a*a*a + b*b*b + c*c*c == n;
	}
}
