class base{
	public int a;
	public void print() {
		System.out.println("base"+" "+a);	
	}
}

class derived extends base{
	public int a;
	public void print() {
		System.out.println("derived"+" "+a);	
	}
}

public class Inheritence {
	public static void print(base b) {
		b.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		base b= new base();			//base class object and base class reference
		base c= new derived();		//base class object and derived class reference
		derived d=new derived();	//base class object and derived class reference
		b.a=10;
		c.a=20;
		d.a=30;
		print(b);					
		print(c);
		print(d);

	}

}

/*Lesson Learnt:
---------------------------------------------------------------------------------------------------------------------------------
Variables in Java Do Not Follow Polymorphism and Overriding				[Source: GeeksForGeeks]
---------------------------------------------------------------------------------------------------------------------------------
	Variables in Java do not follow polymorphism. Overriding is only applicable to methods but not to variables. 
	In Java, if the child and parent class both have a variable with the same name, 
	Child class’s variable hides the parent class’s variable, even if their types are different. 
	This concept is known as Variable Hiding. 
	In the case of method overriding, overriding methods completely replace the inherited methods but in variable hiding, 
	the child class hides the inherited variables instead of replacing them which basically means that the object of Child class 
	contains both variables but Child’s variable hides Parent’s variable. 
	Hence when we try to access the variable within Child class, it will be accessed from the child class. 
	If we are trying to access the variable outside of the Parent and Child class, 
	then the instance variable is chosen from the reference type.
---------------------------------------------------------------------------------------------------------------------------------

*/