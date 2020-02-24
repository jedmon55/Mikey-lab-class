package prog1;

public class Prog1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // there are no variables declared in main
		
	System.out.println("Set a breakpoint here and single-step.");
	
	Computer c1 = new Computer("Dell", "Core 2", 2, 140, 2.40);    //JD - looks like a class that needs to be defined
	Laptop n1 = new Laptop("Apple", "Core i7", 8, 500, 2.66, 15.0, 8.5);  //JD -  another class that needs to be defined
	
	Computer c2 = n1; // ok because a laptop is a computer
	// The computer doesn't know that c2 really contains a laptop.
	//Laptop n2 = c2;
	
	Laptop n2 = (Laptop) c2; // compiler error  don't understand the change I made
	
	// (Laptop) c2 is a CAST, which is like a dynamic declaration
	// We are telling the compiler that we are certain that c2
	// contains a laptop at this point in the program
	// JD - don't understand what CAST means nor the following syntax "Laptop n2 = (Laptop) c2"
	/* JD - c1 = an instance of the Computer object
	 * JD - n1 = an instance of the Laptop object
	 * JD - c2 = looks like c2 has been assigned the attributes of laptop n1 - a laptop is a computer
	 * JD - n2 = looks like n2 has been assigned the attributes of c2 which was assigned the attributes of a laptop
	 * JD - n3 = looks like down below n3 is going to be assigned the attributes of c2 the same as n2 was assigned c2
	 * JD - n4 = looks like n4 is being assigned the attributes of c1 and it is not going to work - why?
	 * probably because it wasn't CAST properly? what the hell is CAST?
	 */
	Laptop n3 = (Laptop) c2; // ok c2 references a laptop
	
	//If we make a mistake, we won't find out until we run the program.
	
	//Laptop n4 = (Laptop) c1; // runtime error that has been commented out
	
	System.out.println(c1 instanceof Laptop); // JD - don't understand what this println is doing - prints false
	                                          // JD - don't understand what instanceof does - prints true
	                                          // JD - what happens when ypu print an object - prints true
	System.out.println(c2 instanceof Laptop);
	System.out.println(n1 instanceof Computer);
	
	System.out.println(c1);  // prints Dell
	System.out.println(n1);  // prints Apple
	
	//Even though c2 is a Computer variable, this prints out
	//the information for Laptop.
	
	System.out.println(c2);  //prints Apple
	
	System.out.println(n1.getWeight());
	
	//Even though n1 and c2 refer to the same thing, this is a 
	//compiler error because the compiler doesn't know this
	
	System.out.println(c2); //printsApple
	
	//If we write a special computePower method for a Laptop, then
	//that gets called even if c2 is a computer variable
	
	System.out.println(c2.computePower());
	
	
	
	
	}

}
