//============================================================================
// Name        : LinearEquation.java
// Course      : CS 2261 Objected-Oriented Programming
// Date        : 9/26/2018
// Author      : Yu Kuwahara
//============================================================================

// make a class that stores two linear equations like,

// ax + by = e
// cx + dy = f
// x = (ed - bf)/(ad - bc)
// y = (af - ec)/(ad - bc)

// in the other class, you will prompt the user for values and calculate


public class LinearEquation 
{
	
	// create private data fields a, b, c, d, e, and f
	
	// note: since they are private, you cannot create them in the public static main function below
	// note: you need to make getter for all the values when you need to use them 
	
	private double a = 0;
	private double b = 0;
	private double c = 0;
	private double d = 0;
	private double e = 0;
	private double f = 0;
	
	
	// create a constructor that takes in arguments for a through f
	
	public LinearEquation(double a, double b, double c, double d, double e, double f)
	{
		
		// note: Keyword THIS is a reference variable in Java that refers to the current object
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		
		// memo: to call this constructor
		// Employee employee = new Employee("Jack", "Daniels", 2000);
		
	}
	
	
	// now create getter for all the values 
	
	// first, getter for a
	
	public double getA() 
	{
		
		return a;
		
	}
	
	// second, getter for b
	
	public double getB()
	{
		
		return b;
		
	}
	
	// next, getter for c
	
	public double getC()
	{
		
		return c;
		
	}
	
	// next, getter for d
	
	public double getD()
	{
		
		return d;
		
	}
	
	// next, getter for e
	
	public double getE()
	{
		
		return e;
		
	}
	
	// finally, getter for f
	
	public double getF()
	{
		
		return f;
		
	}
	
	
	// now create setters for all the values
	
	// first, setter for a
	
	public void setA(double a)
	{
		
		this.a = a;
		
	}
	
	// next, setter for b
	
	public void setB(double b)
	{
		
		this.b = b;
		
	}
	
	// next, setter for c
	
	public void setC(double c)
	{
		
		this.c= c;
		
	}
	
	// next, setter for d
	
	public void setD(double d)
	{
		
		this.d = d;
		
	}
	
	// next, setter for e
	
	public void setE(double e)
	{
		
		this.e = e;
		
	}
	
	// finally, setter for f
	
	public void setF(double f)
	{
		
		this.f = f;
		
	}
	
	
	// now create a method that returns true if a*d - b*c is not 0
	// since you want to return true or false, use boolean
	
	public boolean isSolvable()
	{
		
		// any denominator cannot be 0 so return false
		
		if (a*d - b*c == 0)
		{
			
			System.out.println("Sorry, these linear equations are not solvable.");
			
			System.out.println();
			
			return false;
			
		}
		
		// if the equation is solvable return true
		
		return true;
		
	}
	
	
	// now create a method that returns the solution for the equation, x
	
	public double getX()
	{
		
		// declare the variable 
		double x;
		
		// solve for x
		x = (e*d - b*f)/(a*d - b*c);
		
		return x;
		
	}
	

	// now create a method that returns the solution for the equation, y
	
	public double getY()
	{
		
		// declare the variable 
		double y;
		
		// solve for y
		y = (a*f - e*c)/(a*d - b*c);
		
		return y;
		
	}

}
