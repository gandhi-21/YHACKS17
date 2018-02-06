import java.util.*;

/// Basic Reward Points Information Card

// Needs a minimum required, current, redeemed, 
// Identifier
//	Setters & Getters
// Constructor
// redeem

public class rewards{
	private int minimum;
	private int current;
	private int number;
	private int flightsegs;
	private int minflights;
	
	public rewards()
	{}
	public rewards(int current, int number, int flightsegs)
	{	this.current = current;
		this.number = number;
		minflights = 40;
		minimum = 45000;
		if(current < minimum || flightsegs < minflights)
		{
			System.out.println("Not Eligible for Rewards Program!");
			return;
		}
		this.flightsegs = flightsegs;}	
	
	public void setcurrent(int current)
	{	this.current = current;}
	
	public void setflightsegs(int flightsegs)
	{	this.flightsegs = flightsegs;}
	
	public int getcurrent()
	{	return current;}
	
	public int getflightsegs()
	{	return flightsegs;}
	
	public int getnumber()
	{	return number;}
	
	public int getmin()
	{	return minimum;}
	
	public int getminflights()
	{	return minflights;}
	
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
		System.out.println("Enter current points:");
		int current = reader.nextInt();
		System.out.println("Enter no of flight segs:");
		int flightsegs = reader.nextInt();
		System.out.println("Enter points to redeem:");
		int points = reader.nextInt();
		rewards first = new rewards(current,number,flightsegs);
		if(first.redeem(points)==true)
			System.out.println("Points redeemed succesfully! Enjoy!");
		else
			System.out.println("Points exceeding redeem limit! Aborted!");
		reader.close();
	}
}