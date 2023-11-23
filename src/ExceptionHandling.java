import java.io.IOException;

class checkNum {
	
	public static double ans(int n) throws Exception{
		if(n==0) throw new RuntimeException(" Not divisible by 0!",new IllegalArgumentException("0 was passed"));
		if(n==1) throw new IOException("1 is not right thing to pass!");
		if(n==2) throw new Exception("2 was passed!");
		return 50/n;
	}

}

public class ExceptionHandling {
	
	public static void main(String[] args) {
	try {
		System.out.println(checkNum.ans(01));
	} catch (IOException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	} catch (RuntimeException  e) {
		e.printStackTrace();
		System.out.println(e.getCause().getMessage());
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	}
}
