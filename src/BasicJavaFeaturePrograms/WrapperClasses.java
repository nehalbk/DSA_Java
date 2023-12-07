package BasicJavaFeaturePrograms;
/* Author 	: Nehal Kankanawadi
 * Date		: 21/11/2023
 * Function	:
 * This program demonstrates cache values of different wrapper classes
 * Integer, Character stores basic commonly used instances in cache so if we compare them we get true
 * This is because when objects of commonly used instances are created new memory is not created,
 * the new object is referenced to cache memory location.
 * But if new objects are created of instances that are not common like 128 or the symbol ॐ,
 * then new memory location is created for each object and the references will not be same hence compare will return false.
 */

public class WrapperClasses {

	public static void main(String[] args) {
		Integer a =10;
		Integer b=10;
		Integer c=128;
		Integer d=128;
		
		Character e='a';
		Character f='a';
		Character g='ॐ';
		Character h='ॐ';
		Character i='$';
		Character j='$';
		
		String k="a";
		String l="a";
		String m="abc";
		String n="abc";
		
		//Integer is a wrapper class and the Integer class keeps a cache of Integer instances in the range of -128 to 127
		System.out.println(a==b); //true
		System.out.println(c==d); //false
		System.out.println();
		//Character is a wrapper class and the Character class keeps a cache of basic Character instances (alphabets, letters, punctuation)
		//but not unusual special characters (from ASCII 0 to 127)
		System.out.println(e==f); //true
		System.out.println(g==h); //false
		System.out.println(i==j); //true
		System.out.println();
		//Every string creates a memory reference if new strings are created with same value they are pointed to same reference hence they 
		// are always equal
		System.out.println(k==l);
		System.out.println(m==n);
		System.out.println();
		
	}

}
