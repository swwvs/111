import java.util.Scanner;

public class hh {

	public static void main(String[] args) {
		System.out.println("hhhh");
		Scanner input =new Scanner(System.in);
		double numbers[]=new double[5];
		int count =0;
		int entered=0;
		boolean containsNumber=false;
		while( entered < numbers.length )
			System.out.print( "Enter number: " );
			double number =input.nextDouble();
			entered++;
			
			if(number>=10 &&  number <=100)
			{
			for (int i=0 ; i<count;i++)
				if (number!=numbers[i])
					containsNumber=false;
			
			if ( !containsNumber ){
	numbers[count]=number;
	count++;
			} // end if
			else
			 System.out.println( number + " has already"+
			" been entered\n");
			}

			else
			System.out.println("number must be between "+
			"10 and 100" );

			
			System.out.println();
	}

}
