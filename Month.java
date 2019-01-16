package Questions;
import java.util.* ;
import java.lang.* ;
public class Month {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in) ;
		char ch='y' ;
		int n ;
		while(ch=='y'||ch=='Y')
		{System.out.println("please enter the month number:");
		n=input.nextInt() ;
		switch(n)
		{case 1: System.out.println("january");
		break ;
		case 2: System.out.println("febuary");
		break ;
		case 3: System.out.println("march");
		break ;
		case 4: System.out.println("april");
		break ;
		case 5: System.out.println("may");
		break;
		case 6: System.out.println("june");
		break ;
		case 7: System.out.println("july");
		break ;
		case 8: System.out.println("august");
		break ;
		case 9: System.out.println("september");
		break ;
		case 10: System.out.println("october");
		break ;
		case 11: System.out.println("november");
		break ;
		case 12: System.out.println("december");
		break ;
		default:System.out.println("the entered option is wrong");
		break ;
		}
		System.out.println("do you want to continue:for yes enter y or for no enter n");
		ch=input.next().charAt(0) ;
		if(ch=='n'||ch=='N')System.exit(0) ;
		}
		}
		
		// TODO Auto-generated method stub

	}

