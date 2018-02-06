import java.util.*;

/// Basic Reward Points Information Card

// Needs a minimum required, current, redeemed, 
// Identifier
//	Setters & Getters
// Constructor
// redeem

public class 1{
	private int minimum;
	private int current;
	private int number;
	private int flightsegs;
	
	public 1(int current, int number, int flightsegs)
	{	this.current = current;
		this.number = number;
		minimum = 45000;
		this.flightsegs = flightsegs;}
	
	public void setcurrent(int current)
	{	this.current = current;}
	
	public void set flightsegs(int flightsegs)
	{	this.flightsegs = flightsegs;}
	
	public int getcurrent()
	{	return curent;}
	
	public int getflightsegs()
	{	return flightsegs;}
	
	public int getnumber()
	{	return number;}
	
	public boolean redeem(int points)
	{	if(current-points < minimum)
		return false;
		else
		{	current-=points;
			return true;}
	}
	
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter identification number:");
		int number = reader.nextInt();
		System.out.println("Enter no of flight segs:");
		int flightsegs = reader.nextInt();
		System.out.println("Enter points to redeem:");
		int points = reader.nextInt();
		1 first = new 1(current,flightsegs);
		if(redeem(points)==true)
			System.out.println("Points redeemed succesfully! Enjoy!");
		else
			System.out.println("Points exceeding redeem limit! Aborted!");
		reader.close();
	}
}