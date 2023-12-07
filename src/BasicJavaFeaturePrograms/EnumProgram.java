package BasicJavaFeaturePrograms;
enum insuranceType{
			LIFE,NON_LIFE,EMPLOYEE_BENEFITS
		}

class AccessEnum{
	
	public static void accessEnum() {
		System.out.println(insuranceType.NON_LIFE);
	}
	
}
public class EnumProgram {

	public static void main(String[] args) {
		
		System.out.println("All available type of insurances are : ");
		for(insuranceType insurance:insuranceType.values()) {
			System.out.println(insurance);
		}
		
		System.out.println();
		
		insuranceType healthInsurance =insuranceType.LIFE;
		System.out.println("Health insurance belongs to : "+ healthInsurance);
		
		insuranceType carInsurance =insuranceType.NON_LIFE;
		System.out.println("Car insurance belongs to : "+ carInsurance);
		
		insuranceType pensionInsurance =insuranceType.EMPLOYEE_BENEFITS;
		System.out.println("Pension insurance belongs to : "+ pensionInsurance);
		
		System.out.println();
		
		//Accessing Enum from other class
		System.out.println("Enum is accessed in non main class but is called from main class :");
		AccessEnum.accessEnum();
		
		//Below code is not allowed as INTEGRATION is not a insurance type defined in insuranceType
		//insuranceType carInsurance =insuranceType.INTEGRATION; 	
		

	}

}


/*
 * Lesson Learnt:
 * 
 * An enum type is a special data type that enables for a variable to be a set of predefined constants.
 * The variable must be equal to one of the values that have been predefined for it.
 * 
 * enum are public static final so can be accessed by all class, are created during compile time and their value cannot be changed.
 */
