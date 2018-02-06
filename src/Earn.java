//	Earning points and adding it to a new file --- main file
// Take input in dollars, convert it into points and store it
/// 6 dollars
import java.io.FileNotFoundException;
import java.util.*;

public class Earn{
	
	public static void main(String[] args) throws FileNotFoundException
	{
		java.io.File File = new java.io.File("Fares.txt");
		Scanner input = new Scanner(File);
		
		java.io.File file = new java.io.File("Pointsearned.txt");
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		
		while(input.hasNext())
		{
			output.println(input.nextDouble()*6);
		}
		
		input.close();
		output.close();
	}
}