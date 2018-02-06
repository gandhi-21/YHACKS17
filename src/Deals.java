import java.util.*;

public class Deals{
	
	public static int convert(double fare)
	{
	int points = (int) (5*Math.round(fare)) + 50;	
	return points;
	}
	
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the best deal you can find: ");
		double fare = reader.nextDouble();
		int points = convert(fare);
		reader.close();
		System.out.println("Points earned: " + points);
		System.out.println("Enjoy Complimanetary Benefits with our Jet Blue Sky Miles Rewards Program!:");
		System.out.println("Free Checked Bags");
		System.out.println("Priority Boarding/Seating");
		System.out.println("Free Cabin Upgrades");
		System.out.println("Expediated Security");
		System.out.println("Lounge Acess");
		
		}
}