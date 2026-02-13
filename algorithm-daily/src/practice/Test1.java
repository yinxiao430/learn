package practice;

public class Test1 {
	public static void main(String[] args) {
		int count=0;
		for(int i=1900;i<=9999;i++) {
			int sumyear=sum(i);
			for(int j=1;j<=12;j++) {
				int summounth=sum(j);
				int day=mounth(i, j);
				for (int k = 1; k <= day; k++) {
					 int sumday=sum(k);
					 int summoda=summounth+sumday;
					 if(summoda==sumyear) {
						count++;
					}
				}
				
			}
			
		}
		System.out.println(count);
		
	}
    public static int sum(int n) {
    	int sum=0;
    	for (int i = 0; i < 4; i++) {
    		sum=sum+(n%10);
    		n=n/10;
		}
		return sum;
    } 
    
    
    public static boolean year(int n) {
    	if(n%100==0) {
    		if(n%400==0) {
    			return true;
    		}
    		else {
				return false;
			}
    	}
    	else if(n%4==0){
			return true;
		}
		else {
			return false;
		}
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
}
