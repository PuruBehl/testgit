package Questions;
import java.util.* ;
public class arrays2d {

	public static void main(String[] args) {
		int x ;
		System.out.println("please enter the number of elements of the array:");
		Scanner input=new Scanner(System.in) ;
		x=input.nextInt();
		int[] a= new int[x] ;
		System.out.println("please enter the array") ;
		for(int i=0;i<x;i++)
		{a[i]=input.nextInt();
		if(a[i]>99) {System.out.println("please enter the number again");a[i]=input.nextInt();}
		}
		for(int i=0;i<x;i++)
			System.out.println(a[i]);
		for(int i=0;i<x;i++)
		{if(a[i]%2!=0)a[i]*=2 ;
		else continue ;
		
		}
		for(int i=0;i<x;i++)
		{System.out.println(a[i]);
		
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
