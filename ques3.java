
package Questions;
import java.util.* ;

public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("please enter the minutes:");
		int min,days=0,month=0,year=0 ;
		Scanner input=new Scanner(System.in) ;
		min=input.nextInt();
		if(min>1440) {days=min/1440 ;
		min=min%1440 ;
		if(days>31) {month=days/31 ;
		days=days%31 ;
		if(month>12) {year=month/12 ;
		month=month%12 ;
		}
		}
		}
		System.out.print("the following are:year:"+year+month+days+min);
		

	}}

