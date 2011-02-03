package edu.radford.codebreakers.helloworld;
/**
 * Test app for team CodeBreakers
 * @author david
 * @author sdsalyer
 */
public class HelloWorld { // Probably shouldn't name the class main

	/**
	 * The main entry point for the application
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.out.println("David Ball was here.");
		
		//now if you guys happen to get in here
		//before i figure everything out, try to
		//leave your name in a comment here
		//don't delete anything in here, but add
		//to it as you need to. --david
		
		// Set up team member names
		String[] names = {"David",
						  "Drew"};
		// Initialize a greeting
		String greeting = "Custom Fit Code, LLC:\n";

		// Loop through the names with enhanced for loop
		for(String n : names){
			// Create a new Greeter object
			Greeter g = new Greeter(n);
			
			// Build the greeting
			greeting += "  " + g.greet();
		} // end for
		
		// Close up the greeting
		greeting += "There's no such thing as \"One size fits all\".";
		
		// Print the greeting
		System.out.println(greeting);
		
		// kill
		System.exit(0);

	} // end main

} // end class
