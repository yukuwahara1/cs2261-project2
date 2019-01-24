# cs2261-project2
linear equation calculator

  The second project for Object-Oriented Programming (Java) was making a 
linear equation calculator. Two classes were required for the project, one for 
taking values and calcualting the linear equations, and one for taking input 
and displaying the solutions if the linear equation is solvable.
	The two linear equations should be stored as below,

ax + by = e

cx + dy = f

x = (ed - bf) / (ad - bc)

y = (af-ec) / (ad - bc)

First, I made privaet data fields for all the values. Second, I 
created a constructor for the values. Then, I made getters and setters for all
the values. Next, I made a method to check if the linear equations are 
solvable that also mean the denomenators are not zero. After that, I created
two methods to solve for x and y. Lastly, I made a program to operate calculations
by using a scanner. All the process was completed inside of the main function. 
	
Main issue I had in this project was just getting used to
"Java way" since I have taken two C++ courses before this course. Future goal is 
making a complex number calculator in Java that I made with C++. It would 
involve a lot of more processes such as taking care of how minus or plus sign
changes depending on the imaginary number.
