package BasicJavaFeaturePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Customers implements Comparable<Customers>{
	int custId;
	String custName;
	int custAge;
	
	public Customers(int custId, String custName, int custAge) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAge = custAge;
	}
	
	public int compareTo(Customers cust) {
		return this.custId-cust.custId;
	}

	@Override
	public String toString() {
		return "{custId:" + custId + ", custName:" + custName + ", custAge:" + custAge + "}";
	}
	
	
	
}

public class SortingAndComparing {

	public static void main(String[] args) {
		List<Customers> customers = new ArrayList<>();
		customers.add(new Customers(01,"AAA",20));
		customers.add(new Customers(03,"BBB",24));
		customers.add(new Customers(04,"ZZZ",21));
		customers.add(new Customers(02,"XXX",29));
		customers.add(new Customers(05,"YYY",40));
		
		System.out.println("Before sorting: ");
		customers.stream().forEach(x->System.out.println(x));
		
		//Sorting using Comparable Interface
		Collections.sort(customers);
		
		System.out.println("\n**************************************\n");
		System.out.println("Sorting using Comparable Interface on CustId: ");
		customers.stream().forEach(x->System.out.println(x));
		
		//Sorting using comparator function
		Collections.sort(customers,(a,b)->a.custName.compareTo(b.custName));
		System.out.println("\n**************************************\n");
		System.out.println("Sorting using Comparator function on CustName: ");
		customers.stream().forEach(x->System.out.println(x));
		
		//Sorting using comparator function
		Collections.sort(customers,(a,b)->a.custAge-b.custAge);
		System.out.println("\n**************************************\n");
		System.out.println("Sorting using Comparator function on CustAgee: ");
		customers.stream().forEach(x->System.out.println(x));
		
		
	}

}


/*
 * Lesson Learnt:
 * 
 * We can sort collections in 2 ways
 * 1. By extending comparable interface and defining our own compareTo method
 * 2. By providing compareTo method as a parameter to sort function
 * 
 * 
 * By using method 1, we can only define 1 way of sorting for a clss
 * i.e., either by age, name or ID
 * 
 * But by using method 2 we can define multiple ways to sort for same class
 * 
 */
