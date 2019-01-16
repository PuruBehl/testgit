package Questions;
class demo{
void demo(int a,int b)
{ a*=2 ;
b/=2 ;
}}

public class test {

	public static void main(String[] args) {
	demo ob=new demo() ;
	int a=15; int b=20 ;
	System.out.print("a and b before "+a+b) ;
	ob.demo(a, b);
	System.out.print("a and b after "+a+b) ;
	
		
		
		

	}

}
