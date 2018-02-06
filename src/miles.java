import java.io.FileNotFoundException;
import java.util.Scanner;

// For earning points, 3 points per dollar
// for redemption, 6 dollar per point
// Increase points 
public class miles{
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		java.io.File File = new java.io.File("Fares.txt");
		Scanner input = new Scanner(File);
		long  fare=1;
		long  i=0;
		while(i<=110106)
		{
			if(i%2==0)
			{	i++;
				continue;}
				double number = input.nextDouble();
				fare +=number;
			//	System.out.println(fare);
				i++;
		}
		System.out.println(fare);
		input.close();
		
		java.io.File File2 = new java.io.File("Points.txt");
		Scanner input2 = new Scanner(File2);
		long points = 0;
		int j=0;
		while(j<=1000)
		{
			if(j%2==0)
			{	j++;
				continue;}
			double number2 = input2.nextDouble();
			points+=number2;
			j++;
		}
		System.out.println(points);
		System.out.println(fare/points + " dollar per point for redemption.");
		
		input2.close();
	}
}