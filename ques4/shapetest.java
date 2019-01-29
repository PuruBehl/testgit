package ques4;

public class shapetest {

	public static void main(String[] args) {rectangle Obj1 = new rectangle(7, 7);
	triangle  Obj2 = new triangle(6, 8);
	shape ref;
	
	ref = Obj1;
	System.out.println("The area of rectangle is " + ref.area());
	
	ref=Obj2;
	System.out.println("The area of triangle is " + ref.area());
	
			
		// TODO Auto-generated method stub

	}

}
