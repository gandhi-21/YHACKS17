import java.io.FileNotFoundException;
import java.util.*;

public class Dealsrelation{
	
	
	public static void main(String[] args) throws FileNotFoundException
	{
		java.io.File file1 = new java.io.File("Type.txt");
		Scanner input1 = new Scanner(file1);
		
		java.io.File file2 = new java.io.File("DealPrice.txt");
		Scanner input2 = new Scanner(file2);
		
		java.io.File file3 = new java.io.File("Dealoints.txt");
		Scanner input3 = new Scanner(file3);
		
		long points = 0;
		long fare = 0;
		int i=0;
		while(i < 4700)
		{
			String type = input1.next();
		//	System.out.println(type);
			if(type.equals("POINTS")==true)
			{
				points += input3.nextDouble();
				fare += input2.nextDouble();
				i++;
			}
			else
			{
				double dump = input2.nextDouble() + input3.nextDouble();
				i++;
				continue;
			}
		}
		
		System.out.println(points/fare + " point per $ redeemed");
		
		input1.close();
		input2.close();
		input3.close();
	}
}