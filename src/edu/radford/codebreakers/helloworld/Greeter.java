package edu.radford.codebreakers.helloworld;

/**
 * Greets you with the given name
 * @author Drew
 *
 */
public class Greeter {
	
	private String name;	// your name
	
	/**
	 * Constructs a Greeter object
	 */
	public Greeter(String yourName){
		this.name = yourName;
	} // end constructor

	/**
	 * Greets you with your name
	 * @return A String greeting.
	 */
	public String greet(){
		return "Hello there, " + this.name + ".\n";
	} // end greet
	
} // end class
