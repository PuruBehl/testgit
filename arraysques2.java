package Questions;
import java.util.* ;
public class arraysques2 {

	public static void main(String[] args) {
		int a,b,i,large,small,seclarge,num,fre,sum=0,sum1=0,sum2=0,count=0,occ=0 ;
		System.out.println("please enter the length of the array:");
		Scanner input=new Scanner(System.in) ;
		a=input.nextInt();
		int[] array=new int[a];
		System.out.println("please enter the array elements");
		for(i=0;i<a;i++)
		{ array[i]=input.nextInt() ;
		sum+=array[i] ;
		
		}large=array[0] ;
		small=array[0] ;
		for(i=0;i<a;i++)
		{ if(large<array[i])large=array[i] ;
		if(small>array[i])small=array[i] ;
		}seclarge=array[0] ;
		for(i=0;i<a;i++)
		{ if(array[i]==large)continue ;
		else { if(array[i]>seclarge)seclarge=array[i] ;}
		
		}
		for(i=0;i<a;i++)
		{ if(i%2==0)sum1+=array[i] ;
		else sum2+=array[i] ;
		if(array[i]%2==0)count++ ;
		}
		System.out.println("please enter the number whose occurence and frequency has to be found out:");
		num=input.nextInt();
		for(i=0;i<a;i++)
		{ if(num==array[i]) {System.out.println("the number is found at:"+(i+1));
		occ++ ;
		}
		
		
		}
		System.out.println("the frequency of the given number is:"+occ) ;
		System.out.println("the sum of all the elements of the array is:"+sum);
		System.out.println("the largest number is the array is:"+large);
		System.out.println("the smallest number is the array is:"+small);
		System.out.println("the second largest number is the array is:"+seclarge);
		System.out.println("the alternate even sum of the array is:"+sum1);
		System.out.println("the alternate sum odd sum of the array is:"+sum2);
		System.out.println("the number of even numbers in the array is:"+count);
		
		// TODO Auto-generated method stub

	}

}
