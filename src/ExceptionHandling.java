import java.io.FileNotFoundException;
import java.io.IOException;

class checkNum {
	
	public static double ans(int n) throws Exception{
		if(n==0) 
			//Unchecked exception with cause as parameter
			//We encountered Runtime Exception. This exception was caused due to IllegalArgumentException
			throw new RuntimeException(" Not divisible by 0!",new IllegalArgumentException("0 was passed")); 
		if(n==1) 
			//Checked Exception checked during compile time
			//only message is sent and cause is not known hence only q parameter
			throw new IOException("File 1 not found!"); 
		if(n==2) 
			//Checked Exception checked during compile time
			//throws IOException i.e Input Output Exception, cause is File not found
			throw new IOException("Error opening file!", new FileNotFoundException("File not found!")); 
		if(n==3) 
			//Generic Exception with no special type or cause
			throw new Exception("3 was passed!");	
		return 50/n;
	}

}

public class ExceptionHandling {
	
	public static void main(String[] args) {
	try {
		System.out.println(checkNum.ans(02));
	} catch (IOException e) {						//Catch specific error first
		System.out.println(e.getCause().getMessage()); //To show user
		System.out.println(e.getCause());			//for developers
		e.printStackTrace();
	} catch (RuntimeException  e) {				//Catch higher order second specific error second
		e.printStackTrace();					//All details
		System.out.println(e.getCause().getMessage());
	} catch(Exception e) {
		System.out.println(e.getMessage());		//Catch generalized error last
	}
	
	}
}

/*
 * Link to Refer all exceptions - https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
  	
 	Parameters for Exception:
 	
	Exception(String message,
	                    Throwable cause,
	                    boolean enableSuppression,
	                    boolean writableStackTrace)
	                    
	Constructs a new exception with the specified detail message, cause, suppression enabled or disabled, and writable stack trace enabled or disabled.
	Parameters:
	
	message - the detail message.
	cause - the cause. (A null value is permitted, and indicates that the cause is nonexistent or unknown.)
	enableSuppression - whether or not suppression is enabled or disabled
	writableStackTrace - whether or not the stack trace should be writable
 */
