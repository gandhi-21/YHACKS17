/// File that writes compiled data to a txt file

import java.io.FileNotFoundException;
import java.util.*;

public class writer{
	
	
	public static void main(String[] args) throws FileNotFoundException
	{
		java.io.File File = new java.io.File("Final.txt");
		java.io.PrintWriter output = new java.io.PrintWriter(File);
		
		java.io.File file1 = new java.io.File("Fares.txt");
		Scanner input1 = new Scanner(file1);
		
		java.io.File file2 = new java.io.File("Pointsearned.txt");
		Scanner input2 = new Scanner(file2);
		
		long i = 1 ;
		output.println("Id \t Expenditure \t Points \t Eligibility");
		while(input1.hasNext())
		{
			boolean eligible = false;
			double points =input2.nextDouble();
			if(points > 3000)
				eligible = true;
			output.println(i + " \t " + Math.round(input1.nextDouble()) + " \t " + Math.round(points) + " \t " + eligible );
			i++;
		}
		
		output.close();
		input1.close();
		input2.close();
	}
}