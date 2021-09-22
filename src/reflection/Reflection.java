/**
 * 
 */
package reflection;

/**

 *  @author Jiayue.Ma 
 * 
 * I am group with ZakharovTatiana. We worked together. However, we have some different idea regarding some methods.
 * Then we decide to submit the assignment separately with different methods. 
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");
		
		StringBuilder list = new StringBuilder();
		Class<?> newclass = o.getClass();
		while(newclass != Object.class) {
			list.append(newclass.getName() + " ingerits from ");
			
			newclass = newclass.getSuperclass();
		}
		
		list.append(Object.class.getName());
		System.out.println(list.toString());
		
		
		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");
    
		Method[] methods = o.getClass().getMethods();
        
		int nMethod = 0;
       
        for (Method method : methods) {
            System.out.printf("%d. %s", ++nMethod, method);
            System.out.println();
        }
        //System.out.printf("%d. End - all  methods of Person class", ++nMethod);
		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
		System.out.println("\n");
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		// Demonstration of the methods on an objet of type String
		// TODO To complete
		String str = new String("good");
		ColoredCircle newCircle = new ColoredCircle();
		
		
		//
		// Demonstration of the methods on an objet of type ColoredCircle
		// TODO To complete	
		r.correspondingClass(str);
		r.inheritanceChain(str);
		r.listMethods(str);
		
		
		r.correspondingClass(newCircle);
		r.inheritanceChain(newCircle);
		r.listMethods(newCircle);
		
	}

}
