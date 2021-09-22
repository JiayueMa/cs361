/**
 * 
 */
package employee;

/**
 * @author Jiayue Ma
  * I am group with ZakharovTatiana. We worked together. However, we have some different idea regarding some methods.
 * Then we decide to submit the assignment separately with different methods. She uses hers, and I use mine.

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code
*/


public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

//		Employee emp2 = new Employee("Don", "Holmes", "123456799");

//		PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcasting
		Employee emp3 = pEmp1;
		
		System.out.println("emp3");
		
		emp3.whoAmI();
		
		// TODO To complete
		// emp3.whoAmI()  prints "PART TIME EMPLOYEE" because a obj of father class pointed at a obj of son class,
		//and in son class, the method has been override. 
		//so emp3.whoAmI() will call the method in son class prior to the method in the father class.
		
		// emp3.getHourlyRate(); // returns syntax error because there is no related method in the father class, 
		//and emp3 is a obj of father class.

		// TODO To complete
		// Add the condition that test that emp3 is an instance of part time employee at
		// this time
		
		 if (emp3 instanceof PartTimeEmployee) {
			 
			 System.out.println("emp3 instance of Part Time Employee"); // printed
		 } 
		 else {
			 System.out.println("emp3 not instance of Part Time employee");
		}

		// Downcasting 1
		// TODO Uncomment and run the code
		//  PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;
				 
		// TODO To complete
		// This instruction does not compile
		// This instruction returns a ClassCastException at run time
		// because we can't force a son class instance point at a father class instance. 
		 //some element in son class is not exist in father class, the memory structures are different.
		 //then complier shows error.

		// Downcasting 2
		// Requires the use of intanceof to avoid a run time cast exception
		// TODO Look at the solution below
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
			System.out.println(pEmp4.getHourlyRate());
		} else {
			System.out.println("emp3 not instance of part time employee");
		}
	}
}
