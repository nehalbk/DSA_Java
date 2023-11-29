class classA{
	
	public int a=5;
	public static int b=6;
	protected int c=7;
	private int d=8;
	
	public int getd() {
		return d;
	}
	
	public void methodA() {
		System.out.println("Hello Non Static Public Method A");
	}
	
	public static void methodB() {
		System.out.println("Hello Static Public Method B");
	}
	
	protected void methodC() {
		System.out.println("Hello Non Static Protected Method C");
	}
	
	protected static void methodD() {
		System.out.println("Hello Static Protected Method D");
	}
	
	private void methodE() {
		System.out.println("Hello Non Static Protected Method E");
	}
	
	private static void methodF() {
		System.out.println("Hello Static Protected Method F");
	}
	
	public void NonStaticHelperMethod() {
		//As method NonStaticHelperMethod is non static it can call both static and non static methods
		System.out.println("Calling private non-static methodE from NonStaticHelperMethod");
		methodE();
		System.out.println("Calling private static methodF from NonStaticHelperMethod");
		methodF();
	}
	
	public static void StaticHelperMethod() {
	//As method StaticHelperMethod is static it can only call static methods
	//	methodE(); 		//cannot be called as it is non static
	System.out.println("Non Static Method E cannot be called from static method StaticHelperMethod");
	System.out.println("Calling private static methodF from StaticHelperMethod");
	methodF();
	
	}
}

public class AccessSpecifiers {

	public static void main(String[] args) {
		
		classA objectA=new classA();
		
		/*------------------------------------------------------------------------------------------------
		Accessing members
		------------------------------------------------------------------------------------------------
		Lets try accessing a and b that are public														*/
		//System.out.println("Called using class");
		//System.out.println(classA.a);		//Not allowed
		
		System.out.println("Called using object");
		System.out.println(objectA.a);		//Allowed and Recommended
		
		outputFormatter();
		
		System.out.println("Called using object");
		System.out.println(objectA.b);		//Allowed but not Recommended
		System.out.println("Called using class");
		System.out.println(classA.b);		//Allowed and Recommended
		
		outputFormatter();
		
		//Lets try accessing c that is protected
		//System.out.println("Called using class");
		//System.out.println(classA.c);		//Not allowed
		
		System.out.println("Called using object");
		System.out.println(objectA.c);		//Allowed and Recommended
		
		outputFormatter();
		
		//Lets try accessing d that is private
		//The field classA.d is not visible outside classA
		//System.out.println("Called using class");
		//System.out.println(classA.d);		//Not allowed
		//System.out.println("Called using object");
		//System.out.println(objectA.d);		//Not allowed	
		//Hence we make use of getter
		System.out.println("Called using object and getter");
		System.out.println(objectA.getd());		//Not allowed	
		
		outputFormatter();
		
		/*------------------------------------------------------------------------------------------------
		Method A
		------------------------------------------------------------------------------------------------
		Lets try calling methodA which is public and non-static
		
		Cannot make a static reference to the non-static method methodA() from the type classA
		System.out.println("Called using class");
		classA.methodA();			//Not Allowed
	
		Can only be called using object of class as non static methods require object */
		System.out.println("Called using object");
		objectA.methodA();			//Allowed and recommended
		
		outputFormatter();
		
		/*------------------------------------------------------------------------------------------------
		
		------------------------------------------------------------------------------------------------
		Method B
		------------------------------------------------------------------------------------------------
		Lets try calling methodB which is public and static
		
		Static methods are compiled and stored and and hence doesn't require object of class
		Hence can be accessed by direct class and object of class */
		System.out.println("Called using class");
		classA.methodB();			//Allowed and recommended
		
		System.out.println("Called using object");
		objectA.methodB();			//Allowed and NOT Recommended
		
		outputFormatter();
		
		/*------------------------------------------------------------------------------------------------
		
		------------------------------------------------------------------------------------------------
		Method C
		------------------------------------------------------------------------------------------------
		Lets try calling methodC which is protected and non-static
		
		Cannot make a static reference to the non-static method methodA() from the type classA 
		System.out.println("Called using class");
		classA.methodC();			//Not Allowed
		
		Can only be called using object of class as non static methods require object */
		System.out.println("Called using object");
		objectA.methodC();			//Allowed and recommended
		
		outputFormatter();
		
		/*------------------------------------------------------------------------------------------------
		
		------------------------------------------------------------------------------------------------
		Method D
		------------------------------------------------------------------------------------------------
		Lets try calling methodD which is protected and static
		
		Static methods are compiled and stored and and hence doesn't require object of class
		Hence can be accessed by direct class and object of class */
		System.out.println("Called using class");
		classA.methodD();			//Allowed and Recommended 
		
		System.out.println("Called using object");
		objectA.methodD();			//Allowed and Not Recommended 
		
		outputFormatter();
		/*------------------------------------------------------------------------------------------------
		
		------------------------------------------------------------------------------------------------
		Method E and F
		------------------------------------------------------------------------------------------------
		Lets try calling methodE and methodF which are private
		
		As methodE is private, The method methodE() from the type classA is not visible
		Cannot make a static reference to the non-static method methodA() from the type classA 
		System.out.println("Called using class");
		classA.methodE();			//Not Allowed
		classA.methodF();			//Not Allowed
		
		The method methodE() from the type classA is not visible
		Cannot make non-static reference also as methodE is private 
		System.out.println("Called using object"); 
		objectA.methodE();			//Not Allowed
		objectA.methodF();			//Not Allowed
		
		To access private methods or members of a class we use helper methods
		Method HelperMethod() is public which can be used to call methodE and wmthodF which are private as follows
		
		First let us see Non-Static helper method 
		System.out.println("Called using class");
		classA.NonStaticHelperMethod();		//Not Allowed */
		System.out.println("Called using object");
		objectA.NonStaticHelperMethod();	//Allowed and Recommended
		outputFormatter();
		
		/*Now let us see Static Helper Method */
		System.out.println("Called using class");
		classA.StaticHelperMethod();	//Allowed and Recommended
		System.out.println();
		System.out.println("Called using object");
		objectA.StaticHelperMethod();	//Allowed and Not Recommended 
		outputFormatter();
		
	}
	
	public static void outputFormatter() {
		System.out.println("------------------------------------------------------------------------------------------------");
	}

}


/*-------------------------------------------------------------------------------------------------
 * Lesson Learnt:
 * ------------------------------------------------------------------------------------------------
 * 
 * 01. Private Specifier
 * 
 * The private access modifier is specified using the keyword private. The methods or data members declared as private are accessible only 
 * within the class in which they are declared. Any other class of the same package will not be able to access these members. 
 * private means “only visible within the enclosing class”.
 *
 * Hence we need helper methods to access private members/methods. Getters and Setters serve this purpose too.
 * 
 * ------------------------------------------------------------------------------------------------
 * 
 * 02.	Protected Specifier
 * 
 * The protected access specifier in Java allows members to be accessed within the same class, subclasses, and classes in the same package.
 * This means that protected members can be accessed by the class itself, its subclasses (even if they are in a different package), 
 * and other classes in the same package.
 *
 * ------------------------------------------------------------------------------------------------
 * 
 * 03. Public Specifier
 * 
 * A class, method or variable can be declared as public and it means that it is accessible from any class, package or location.
 * 
 * ------------------------------------------------------------------------------------------------
 * 
 * 04. Non-Static
 * 
 * Non-Static methods are created during run time therefore compiler will not be knowing of their existence.
 * Calling them directly will compiler error.
 * Hence, Non-Static methods and members can only be accessed via object of class.
 * Creating object will create the methods during runtime and hence then the methods are visible
 * 
 * ------------------------------------------------------------------------------------------------
 * 
 * 05. Static
 * 
 * Static methods are created during compile time and compiler will be knowing its existence.
 * Hence, these can be called directly by class or by object of class.
 * As everything has special purpose static methods must be called statically i.e by direct class.
 * 
 * ------------------------------------------------------------------------------------------------
 * 
 * 06. Accessing non-static methods from static class
 * 
 * When you access a non-static method say "A" from a static method say "B" what happens is,
 * B is created during compile time
 * Inside B is a call to non static method A
 * While creating B it will see the call to A
 * then compiler will check for A
 * but as A is non-static, compiler won't be able to find A
 * hence compiler will return error. 	
 * 
 * This is explained in above program while calling methodE and methodF
 */
