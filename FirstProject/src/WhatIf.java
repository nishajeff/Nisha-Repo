
public class WhatIf {
	public static void main( String[] args )
	{
		int people = 20;
		int cats = 20;//Now that people =cats neither message about cats will be printed
		int dogs = 15;

		if ( people < cats )    //Only if the condition in the IF clause is true the code under it is executed
		{
			System.out.println( "Too many cats!  The world is doomed!" );
		}//The curly braces represents the end of the code corresponding to IF 

		if ( people > cats )
		{
			System.out.println( "Not many cats!  The world is saved!" );
		}

		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}

		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}

		dogs += 5;

		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}


}
