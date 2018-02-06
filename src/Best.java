import java.io.FileNotFoundException;
import java.util.*;

public class Best{
	
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Please Enter Origin Airport: ");
		String Origin = reader.next();
		System.out.println("Please Enter Destination Airport: ");
		String Dest = reader.next();
		
		java.io.File origin = new java.io.File("Origin.txt");
		Scanner input1 = new Scanner(origin);
		
		java.io.File dest = new java.io.File("Dest.txt");
		Scanner input2 = new Scanner(dest);
		
		while(!input1.next().equals(Origin))
		{}
		
		while(!input2.next().equals(Dest))
		{}
		
		
	}
}