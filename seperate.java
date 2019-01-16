package Questions;
import java.util.* ;
public class seperate {

	public static void main(String[] args) {
int i=0 ;		
		Scanner input=new Scanner(System.in) ;
		System.out.println("please enter the five digit integer:");
		int a  ;
		a=input.nextInt() ;
		if(a<10000) {System.out.println("the enetered number is wrong");}
		int[] b = new int[6] ;
		for(i=0;i<5;i++)
		{b[i]=a%10 ;
		a=a/10;
		
		}
		for(i=5;i>0;i--)
		{System.out.print("   "+b[i]);
		
		}
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
