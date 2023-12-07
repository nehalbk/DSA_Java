package BasicJavaFeaturePrograms;
import java.util.Arrays;
import java.util.List;

public class StreamAPI {

	public static void main(String[] args) {
		
		//Let us consider a list 'a' of integers
		List<Integer> a= Arrays.asList(0,2,3,4,6,7,8,10,2,7);
		
		System.out.println("List a : \n" + a+"\n");
		/*----------------------------------------------------------------------------------------------------------------------------------
		 * 						****FILTER****
		 * 
		 * Filter will return all elements that match the condition
		 * if we want to get all odd numbers		
		 *  
		 */
		
		System.out.println("Odd numbers in list a :");
		List<Integer> b = a.stream().filter(x -> x%2!=0).toList();
		
		//for each will do prescribed operation on each element
		//here we are printing each element
		b.forEach(x->System.out.print(x+" "));
		
		System.out.println("\n");
		
		/*----------------------------------------------------------------------------------------------------------------------------------
  		 *						****MAP****
		 * map will convert each element based on the operation specified
		 * here we are multiplying each element by 2
		 *
		 */
		System.out.println("The squares of all elements of a :");
		List<Integer> c = a.stream().map(x -> x*2).toList();
		
		System.out.println(c);
		
		/*----------------------------------------------------------------------------------------------------------------------------------
  		 *						****REDUCE****
		 *reduce will take	2 parameters does operation on them and stores the result in first parameter for next iteration
		 *for ex x and y are first 2 elements. Initial it will add x and y and store the result in x
		 *in next iteration x holds sum of previous values and y will be the third value of list
		*/
		
		System.out.println("\nThe sum of all elements of a is :");
		Integer d1 = a.stream().reduce(0,(x,y) -> x+y);
		
		Integer d2 = a.stream().reduce((x,y) -> x+y).orElse(null);
		
		System.out.println(d1 +" " +d2);
		
		List<String> s= Arrays.asList("Hello","everyone!","this is biggest","word");
		System.out.println("\nThe list s is :\n" + s);
		
		System.out.println("\nThe longest word in s :");
		String s1 = s.stream().reduce((m,n) -> m.length()>n.length()?m:n).orElse(null);
		
		System.out.println(s1);
		
		/*---------------------------------------------------------------------------------------------------------------------------------
  		 *				****ANYMATCH****
		 * 
		 * any match checks if there is any element that matches the condition
		 */
		
		boolean containZero = a.stream().anyMatch(x->x==0);

		System.out.println("\nDoes a contain zero? :");
		System.out.println(containZero);
		
		
		/*---------------------------------------------------------------------------------------------------------------------------------
  		 *				****ALLMATCH****
		 * 
		 * all match checks if all elements matches the condition
		 */
		
		boolean isZero = a.stream().allMatch(x->x==0);
		
		System.out.println("\nAre all elements of a zero? :");
		System.out.println(isZero);
		
		/*---------------------------------------------------------------------------------------------------------------------------------
  		 *				****SKIP****
		 * 
		 * skip can be used to skip starting elements
		 */
		
		boolean containZero2 = a.stream().skip(1).anyMatch(x->x==0);

		System.out.println("\nDoes a contain zero after skipping first element:");
		System.out.println(containZero2);
		
		/*---------------------------------------------------------------------------------------------------------------------------------
  		 *				****DISTINCT****
		 * 
		 * returns non only distinct values (without duplicates)
		 */
		
		System.out.println("\nThe distinct elements of a :");
		List<Integer> dist = a.stream().distinct().toList();
		
		System.out.println(dist);
		
		/*---------------------------------------------------------------------------------------------------------------------------------
  		 *				****LIMIT****
		 * 
		 * ONLY given the number of elements prescribed in limit
		 */
		
		System.out.println("\nFirst 5 elements of a :");
		List<Integer> lim = a.stream().limit(5).toList();
		
		System.out.println(lim);
		
		/*---------------------------------------------------------------------------------------------------------------------------------
  		 *				****PEAK****
		 * 
		 * acts as intermediate step to do operation on current element
		 */
		
		System.out.println("\nElements >2 in a :");
		List<Integer> peak = a.stream().peek((m)->System.out.print(m+" ")).filter(m->m>2).toList();
		
		System.out.println("\n"+peak);
	}

}
