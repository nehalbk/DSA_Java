/* Author 	: Nehal Kankanawadi
 * Date		: 21/11/2023
 * Function	:
 * In this program we will see how 3 level of inheritance work.
 * we have 3 classes in the order Vehicle --> Bike --> R15
 * we will see how to call constructor from all 3 levels
 * we will see how can we initialize public and private variables of classes using constructor and backward function call
 * we will see how to print if print function is overridden in all 3 classes
 */

class Vehicle{
	private String type1;
	private String type2;
	String type3;
	
	//Constructor
	//Setting value of a private variable type and printing it
	Vehicle(String Type){
		this.type1=Type;
		System.out.println("\nIn vehicle constructor, type1 (private): "+type1 +" 01");
	}
	
	//In print
	//Printing other 2 values which are not set by constructor
	public void print() {
		System.out.println("\nIn Vehicle print\n");
		System.out.println("In vehicle print, type2 (private): "+type2 +" 02");
		System.out.println("In vehicle print, type3 (public): "+type3 +" 03");
	}
	
	//Setting value of private variable that is not set by constructor
	void setParentParameter(String Type) {
		this.type2=Type;
		//printing of this class is taken in derived class Bike using super
		//if we use print(); here it will execute print function of R15 
		//as it is most child class and it overrides all upper class implementations
	}
}


class Bike extends Vehicle{
	private String model1;
	private String model2;
	String model3;
	
	
	//Constructor
	//Setting value of a private variable type and printing it and calling parent class constructor to initialize it
	Bike(String Model, String type){
		
		//Calling constructor of parent class i.e Vehicle to set type
		super(type);
		
		//Initializing model
		this.model1=Model;
		
		//Printing model
		System.out.println("\nIn Bike constructor, model1 (private) : "+model1 +" 01");
	}
	
	//In print
	//Printing other 2 values which are not set by constructor
	public void print() {
		
		System.out.println("\nIn Bike print\n");
		//Printing other 2 values
		System.out.println("In Bike print, model2 (private) : "+model2 +" 02");
		System.out.println("In Bike print, model3 (public) : "+model3 +" 03");
		
		//Calling super class i.e. Vehicle to print
				super.print();
	}
	
	
	//Setting required private variable model2 and calling parent class to set its private variable
	void callParent(String Model, String type) {
		
		//Calling parent class to set its private variable type2
		super.setParentParameter(type);
		
		//Initializing private variable model2
		this.model2=Model;
		
		//printing of this class is taken in derived class R15 using super
		//if we use print(); here it will execute print function of R15 
		//as it is most child class and it overrides all upper class implementations
	}
	
}

class R15 extends Bike{
	private int price1;
	private int price2;
	int price3;
	
	R15(int Price,String model, String type){
		//Calling super class i.e Bike to set its variables using constructor and pass further variables to Vehicle class
		super(model,type);
		
		//price is of R15 class itself so can be directly initialized 
		price1=Price;
		price2=Price;
		price3=Price;
		
		//model3 and type 3 are public so can be directly assigned
		model3=model;
		type3=type;
		
		System.out.println("\nIn R15 constructor, price1 (private): "+price1 +" 01");
		
		
		//Private class variable cannot be initialized directly
		//They need to be initialized in their own class
		//This can be done by calling parent class to set its private variable
		super.callParent(model,type);
		
		//Printing all values
		print();
		
	}
	
	//Printing R15 details
	public void print() {	
		System.out.println("\nIn R15 print\n");
		System.out.println("In R15 print, price2 (private): "+price2 +" 02");
		System.out.println("In R15 print, price3 (public): "+price3 +" 03");
		
		//Calling super class i.e. Bike to print
		super.print();
	}
	
}

public class Inheritance2Super {

	public static void main(String[] args) {
		new R15(200000,"Sports","Bike");

	}

}
