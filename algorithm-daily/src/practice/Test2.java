package practice;


//日期问题
public class Test2 {
	public static void main(String []args) {
		int count=1;
		for(int y=2000;y<2000000;y++) {
			for(int m=1;m<=12;m++) {
				int day=mounth(y, m);
				for(int d=1;d<=day;d++) {
					if(beishu(y, m, d)) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
		
		
	}
	public static boolean year(int year) {
		if((year%4==0&&year%100!=0)||(year%400==0)) {
			return true;
		}
		return false;
	}
	 public static int mounth(int year, int mounth) {
	    	if((mounth==1)||(mounth==3)||(mounth==5)||(mounth==7)||(mounth==8)||(mounth==10)||(mounth==12)) {
	    		return 31;
	    	}
	    	else if(mounth==4||mounth==6||mounth==9||mounth==11) {
	    		return 30;		
			}
			else {
				if(year(year)) {
					return 29;
				}
				else {
					return 28;
				}
			}
		}
		
	public static boolean beishu(int y,int m,int d) {
		if(y%m==0&&y%d==0) {
			return true;
		}
		return false;
		
	}

}
