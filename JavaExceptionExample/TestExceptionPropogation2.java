package JavaExceptionExample;

public class TestExceptionPropogation2 {
	  void m(){  
		    throw new java.io.IOException("device error");//checked exception  
		  }  
		  void n(){  
		    m();  
		  }  
		  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handeled");}  

	public static void main(String args[]){  
		   TestExceptionPropogation2 obj=new TestExceptionPropogation2();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  }  

}
