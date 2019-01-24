//============================================================================
// Name        : TestProgram.java
// Course      : CS 2261 Objected-Oriented Programming
// Date        : 9/26/2018
// Author      : Yu Kuwahara
//============================================================================


// write a test program (class) that prompts the user for the six values 
// and report if the equation has a solution
// if so, display

// first, import scanner to take input from the user

import java.util.Scanner;

public class TestProgram 
{
	
	public static void main(String [] args)
	{
		
		// declare variables for all the values
		
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		double f = 0;
		
		
		// create a scanner to take input as double 
		
		Scanner in = new Scanner(System.in);
		
		
		// now start asking the user
		
		System.out.println("Welcome to linear equation calculator!");
		
		// insert a blank space
		
		System.out.println();
		
		
		// ask for all the values
		
		// ask for a 
		
		System.out.println("Please enter a value for a: ");
		
		// the input becomes a 
		
		a = in.nextDouble();
		
		System.out.println();
		
		
		// ask for b
		
		System.out.println("Please enter a value for b: ");
		
		b = in.nextDouble();
		
		System.out.println();
		
		
		// ask for c
		
		System.out.println("Please enter a value for c: ");
		
		c = in.nextDouble();
		
		System.out.println();
		
		
		// ask for d
		
		System.out.println("Please enter a value for d: ");
		
		d = in.nextDouble();
		
		System.out.println();
		
		
		// ask for e
		
		System.out.println("Please enter a value for e: ");
		
		e = in.nextDouble();
		
		System.out.println();
		
		
		// ask for f
		
		System.out.println("Please enter a value for f: ");
		
		f = in.nextDouble();
		
		System.out.println();
		
		
		// you need to close the scanner right after you are done taking input
		
		in.close();
		
		
		// check if the equation is solvable or not before you solve for x and y
		
		// first call the constructor in LinearEquation class 
		
		LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
		
		
		// check to see if it is possible to solve 
		
		if (linearEquation.isSolvable())
		{
			
			// if it is possible, display the solutions
			
			System.out.println("The solutions to this linear equations is: ");
			
			System.out.println("x = " + linearEquation.getX());
			
			System.out.println();
			
			System.out.println("y = " + linearEquation.getY());
			
			System.out.println();
			
			System.out.println("Thank you for using the calculator!");
			
		}
		
	}
	
}
