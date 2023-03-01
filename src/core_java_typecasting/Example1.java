package core_java_typecasting;

public class Example1 {
	public static void main(String[] args)
	{
		// Declaring an Integer datatype
		int a = 3;

		// Casting to Large datatype
		double db = (double)a;

		// Print and display the casted value
		System.out.println(db);

		// Narrow Casting conversion
		int db1 = (int)db;
		
		// Print an display narrow casted value
		System.out.println(db1);
	}
}


/*
 * There are many situations that come when we have to change the functionality
 * of the output as well as the type of output according to the need of the
 * requirements
 * 
 * Syntax: () is Cast Operator
 * 
 * RequiredDatatype=(TargetType)Variable
 */